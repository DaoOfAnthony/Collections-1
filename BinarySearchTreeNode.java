public class BinarySearchTreeNode<E extends Comparable<E>> {
    private BinarySearchTreeNode<E> left;
    private BinarySearchTreeNode<E> right;
    private E data;

    public BinarySearchTreeNode(E data) {
        this.data = data;
        left = null;
        right = null;
    }
    
    public void insert(E element) {
        if (data.compareTo(element ) > 0) {
            if (left == null) {
                left = new BinarySearchTreeNode<E>(element);
            } else {
                left.insert(element);
            }
        } else {
            if (right == null) {
                right = new BinarySearchTreeNode<E>(element);
            } else {
                right.insert(element);
            }
        }
    }
    
    public E search(E element) {
        if(data.compareTo(element) == 0) {
            return element;
        } else if(data.compareTo(element) > 0) {
            if(left == null) {
                return null;
            } else {
                return left.search(element);
            }
        } else {
            if(right == null) {
                return null;
            } else {
                return right.search(element);
            }
        }
    }
    
    public E getData() {
        return data;
    }
    
    public void setData(E newData) {
        data = newData;
    }
    
    public BinarySearchTreeNode<E> getLeft()
    {
        return left;
    }
    
    public void setLeft(BinarySearchTreeNode<E> newLeft) {
        left = newLeft;
    }
    
    public BinarySearchTreeNode<E> getRight()
    {
        return right;
    }
    
    public void setGreater(BinarySearchTreeNode<E> newRight) {
        right = newRight;
    }
}
