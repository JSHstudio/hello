def vector_size_check(*vector_variables):
    return all([len(vector_variables[0]) == len(v) for v in [*vector_variables]])
    # return all(len(vector_variables[0]) == x for x in [len(vector) for vector in vetor_variables[1:]])

def vector_addition(*vector_variables):
    if vector_size_check(*vector_variables) == False:
        raise ArithmeticError
    return [sum(x) for x in zip(*vector_variables)]


def vector_subtraction(*vector_variables):
    if not vector_size_check(*vector_variables):
        raise ArithmeticError
    return [2*x[0] - sum(x) for x in zip(*vector_variables)]


def scalar_vector_product(alpha, vector_variable):
    return [alpha * x for x in vector_variable]


def matrix_size_check(*matrix_variables):
    return all([len(matrix_variables[0]) == len(m) for m in matrix_variables])
    # return all([len(set(len(matrix[0]) for matrix in matrix_variables)) == 1] and all([len(matrix_variable[0]) == len(matrix) for matrix in matrix_variables]))

def is_matrix_equal(*matrix_variables):
    return all([matrix_variables[0] == m for m in matrix_variables])
    # return all([all([len(set(row)) == 1 for row in zip(*matrix)]) for matrix in zip(*matrix_variables)])

def matrix_addition(*matrix_variables):
    if not matrix_size_check(*matrix_variables):
        raise ArithmeticError
    return [[sum(x) for x in zip(*t)] for t in zip(*matrix_variables)]


def matrix_subtraction(*matrix_variables):
    if not matrix_size_check(*matrix_variables):
        raise ArithmeticError
    return [[2 * x[0] - sum(x) for x in zip(*t)] for t in zip(*matrix_variables)]


def matrix_transpose(matrix_variable):
    return [[element for element in row] for row in zip(*matrix_variable)]


def scalar_matrix_product(alpha, matrix_variable):
    return [scalar_vector_product(alpha, row) for row in matrix_variable]


def is_product_availability_matrix(matrix_a, matrix_b):
    return all([len(row) == len(columns) for row, columns in zip(matrix_a, matrix_transpose(matrix_b))])
    # return len([column_vector for column_vector in zip(*matrix_a)]) == len(matrix_b)

def matrix_product(matrix_a, matrix_b):
    if not is_product_availability_matrix(matrix_a, matrix_b):
        raise ArithmeticError
    return [[sum(a*b for a, b in zip(row_a, column_b)) for column_b in zip(*matrix_b)]for row_a in matrix_a]
