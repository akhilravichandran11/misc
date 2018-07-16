#!/usr/bin/python

meetings =  [(3, 5),(1, 10),(7, 9),(2, 6)]
def merge_ranges(meetings):
	
	sorted_meetings = sorted(meetings)
	print sorted_meetings
	merged_meetings = [sorted_meetings[0]]
	print merged_meetings[-1]
	
	for current_start_meeting , current_end_meeting in sorted_meetings[1:]:
		if current_start_meeting >= merged_meetings[-1][0] and current_start_meeting <= merged_meetings[-1][1]
			removed_merged_meeting = merged_meetings[-1]
			del merged_meetings[-1]
			
	
	
	
	
	
	
merge_ranges(meetings)
	