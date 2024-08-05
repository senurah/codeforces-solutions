a = int(input())
for i in range(a):
    b = str(input())
    if len(b) > 10:
        f_l, l_l = b[0], b[-1]
        print(f_l+f"{len(b)-2}"+l_l)
    else:
        print(b)
