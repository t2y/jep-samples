from my_module1 import add, calc
from my_module2 import sub

NUMS = range(10)


def main():
    print('add and sub:', sub(add(5, 3), 2))
    print('calc:', calc(NUMS))


if __name__ == '__main__':
    main()
