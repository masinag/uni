def move(n, source, target, aux):
    if n>0:
        move(n-1, source, aux, target)
        target.append(source.pop())
        print(A, B, C, '##############', sep = '\n')
        move(n-1, aux, target, source)

A =[3, 2, 1]
B = []
C = []

move(len(A), A, B, C)
