MAX_LENGTH = 10

def count_capitals(w):
    count = 0
    for c in w:
         count += c.isupper()
    return count

def check_and_rec(w, cc, cd, cb, dd, bb, ww, i, j):
    if len(w) - j < len(dd[i]): return
    for x in range(len(dd[i])):
        if w[j+x] != dd[i][x]:
            return

    get_language( w[:j] + bb[i] + w[j+len(dd[i]):], \
                  cc-cd[i]+cb[i], cd, cb, dd, bb, ww)

def get_language(w, cc, cd, cb, dd, bb, ww):
    if (cc == 0):
        ww.add(w)
    elif(len(w) <= MAX_LENGTH):
        for i in range(len(dd)):
            for j in range(len(w)):
                check_and_rec(w, cc, cd, cb, dd, bb, ww, i, j)

def main():
    dd = []
    bb = []
    cd = [] # number of capital letters in the drivers
    cb = [] # number of capital letters in the bodies
    with open("productions") as f:
        for r in f:
            d, b = r.split()
            dd.append(d)
            bb.append(b.replace("\\0", "\0"))
            cd.append(count_capitals(d))
            cb.append(count_capitals(b))
    ww = set()
    get_language(dd[0], cd[0], cd, cb, dd, bb, ww)
    wws = list(ww)
    wws.sort(key=lambda item : (len(item), item))
    for w in wws:
        print(w, end=" ")
    print()

if __name__ == '__main__':
    main()
