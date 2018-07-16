#!/usr/bin/python

import unittest

from operator import itemgetter

def sort_meeting_times(lists):
	return sorted(lists, key=itemgetter(0))

def merge_ranges(meetings):
	
	if(len(meetings) <= 1):
		return meetings
	
	sorted_meetings = sort_meeting_times(meetings)
	
	
	merged_meeetings = [sorted_meetings[0]]
	prev_index = 0
	
	for cur_start_time,cur_end_time in sorted_meetings:
		prev_start_time,prev_end_time = merged_meeetings[prev_index]
		
		if ((cur_start_time <= prev_end_time) and (cur_start_time >= prev_start_time)):
			new_end_time = cur_end_time if (cur_end_time > prev_end_time) else prev_end_time
			merged_meeetings[prev_index] = (prev_start_time,new_end_time)
		else:
			merged_meeetings.append((cur_start_time,cur_end_time))
			prev_index = prev_index + 1
		
	return merged_meeetings

# Tests

class Test(unittest.TestCase):

	def test_meetings_overlap(self):
		actual = merge_ranges([(1, 3), (2, 4)])
		expected = [(1, 4)]
		self.assertEqual(actual, expected)

	def test_meetings_touch(self):
		actual = merge_ranges([(5, 6), (6, 8)])
		expected = [(5, 8)]
		self.assertEqual(actual, expected)

	def test_meeting_contains_other_meeting(self):
		actual = merge_ranges([(1, 8), (2, 5)])
		expected = [(1, 8)]
		self.assertEqual(actual, expected)

	def test_meetings_stay_separate(self):
		actual = merge_ranges([(1, 3), (4, 8)])
		expected = [(1, 3), (4, 8)]
		self.assertEqual(actual, expected)

	def test_multiple_merged_meetings(self):
		actual = merge_ranges([(1, 4), (2, 5), (5, 8)])
		expected = [(1, 8)]
		self.assertEqual(actual, expected)

	def test_meetings_not_sorted(self):
		actual = merge_ranges([(5, 8), (1, 4), (6, 8)])
		expected = [(1, 4), (5, 8)]
		self.assertEqual(actual, expected)

	def test_sample_input(self):
		actual = merge_ranges([(0, 1), (3, 5), (4, 8), (10, 12), (9, 10)])
		expected = [(0, 1), (3, 8), (9, 12)]
		self.assertEqual(actual, expected)


unittest.main(verbosity=2)