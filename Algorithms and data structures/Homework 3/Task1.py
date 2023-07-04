# Класс, представляющий узел красно-черного дерева
class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None
        self.color = "red"  # Красный или черный

# Класс, представляющий левостороннее красно-черное дерево


class LeftRedBlackTree:
    def __init__(self):
        self.root = None

    # Метод для вставки нового элемента в дерево
    def insert(self, data):
        node = Node(data)
        self.root = self.insert_recursive(self.root, node)
        self.root.color = "black"

    # Рекурсивный метод для вставки элемента в дерево
    def insert_recursive(self, root, node):
        if root is None:
            return node

        if node.data < root.data:
            root.left = self.insert_recursive(root.left, node)
        else:
            root.right = self.insert_recursive(root.right, node)

        # Балансировка дерева после вставки нового элемента
        if self.is_red(root.right) and not self.is_red(root.left):
            root = self.rotate_left(root)
        if self.is_red(root.left) and self.is_red(root.left.left):
            root = self.rotate_right(root)
        if self.is_red(root.left) and self.is_red(root.right):
            self.flip_colors(root)

        return root

    # Метод для поворота дерева влево
    def rotate_left(self, node):
        x = node.right
        node.right = x.left
        x.left = node
        x.color = node.color
        node.color = "red"
        return x

    # Метод для поворота дерева вправо
    def rotate_right(self, node):
        x = node.left
        node.left = x.right
        x.right = node
        x.color = node.color
        node.color = "red"
        return x

    # Метод для изменения цветов узлов
    def flip_colors(self, node):
        node.color = "red"
        node.left.color = "black"
        node.right.color = "black"

    # Метод для проверки, является ли узел красным
    def is_red(self, node):
        if node is None:
            return False
        return node.color == "red"


tree = LeftRedBlackTree()
tree.insert(10)
tree.insert(5)
tree.insert(15)
tree.insert(3)
tree.insert(7)
tree.insert(13)
tree.insert(17)
