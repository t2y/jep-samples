from my_module2 import sub

def add(x, y):
    """
    >>> add(2, 3)
    5
    """
    return x + y


def calc(nums):
    """
    >>> calc(range(10))
    45
    """
    return sum(nums)
