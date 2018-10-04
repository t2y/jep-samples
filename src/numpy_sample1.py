import numpy as np


def show_arrays(arrays):
    for array  in arrays:
        print(array)
        for i in array:
            print(i)


def update_arrays(arrays):
    rv = []
    for array  in arrays:
        rv.append(np.array(list(map(lambda x: x + 1.0, array))))
    return np.array(rv)


def test():
    a = np.array([[11, 12, 13], [21, 22, 23]])
    show_arrays(a)
    rv = update_arrays(a)
    show_arrays(rv)


if __name__ == '__main__':
    test()
