import sys


class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None


def mergeKLists(self, lists):
    final_list = []
    lists_length = len(lists)
    # print "Lists Length = ", lists_length
    while True:
        selected_index = -1
        min_val = sys.maxint
        for index in range(0, lists_length):
            current_list = lists[index]
            # print "Current Index = ", index, " | List = ", current_list.val
            # if ( current_list ) else "None"
            if current_list != None:
                current_val = current_list.val
                if current_val < min_val:
                    selected_index = index
                    min_val = current_val
        if selected_index >= 0:
            lists[selected_index] = lists[selected_index].next
            final_list.append(min_val)
            # print "Final List = ", final_list
        else:
            break
    return final_list


def mergeKLists(lists):
    head = point = ListNode(0)
    final_list = []
    lists_length = len(lists)
    list_index = [0] * lists_length
    lists_parsed = 0
    min_val = sys.maxint
    print "Lists Length = ", lists_length
    while lists_parsed < lists_length:
        print "Lists Parsed = ", lists_parsed
        selected_index = -1
        min_val = sys.maxint
        for index in range(lists_length):
            curent_index = list_index[index]
            current_list = lists[index]
            print "Current Index = ", curent_index, " | List = ", current_list, " | List Length = ", len(current_list)
            if curent_index == (len(current_list) - 1):
                list_index[index] = curent_index + 1
                lists_parsed = lists_parsed + 1
            if curent_index < len(current_list):
                current_val = current_list[curent_index]
                if current_val < min_val:
                    selected_index = index
                    min_val = current_val
        if selected_index >= 0:
            list_index[selected_index] = list_index[selected_index] + 1
            point.next = ListNode(min_val)
            point.next
            final_list.append(min_val)
            print "Final List = ", final_list
    return head.next


lists = [[1, 3, 5], [2, 4, 6]]
mergeKLists_1(lists)
