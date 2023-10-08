import random

cnt, mn, mx = 10, 1, 1000

lst = sorted(list(set(random.randint(mn, mx) for _ in range(cnt))))
search_el = lst[random.randint(0, len(lst)-1)]

print(f'Заданный массив: {lst}', f'Искомый элемент: {search_el}', sep='\n')

curr_indx, left_board, right_board =  len(lst)//2, 0, len(lst)-1
curr_el = lst[curr_indx]
i = 0
while curr_el != search_el:
    if curr_el > search_el:
        curr_indx, right_board = left_board + (curr_indx - left_board) // 2, curr_indx
    else: 
        curr_indx, left_board = curr_indx + (right_board - curr_indx) // 2 + 1, curr_indx
    curr_el = lst[curr_indx]
print(f'Искомый элемент {curr_el} имеет индекс {curr_indx}')