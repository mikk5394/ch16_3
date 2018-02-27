package ch16;
/*
Write a java method that could be added to the Linked list class to move the first element of the list to the end of the list.
If the list is empty or has just one element, its contents should not be modified.
 */

public class ch16_3 {
    public static void main(String[] args) {

        LinkedIntList liste = new LinkedIntList();
        liste.add(1);
        liste.add(5);
        liste.add(3);
        liste.add(2);
        liste.firstToLast();
        System.out.println(liste);

    }
    /*
    kaldte metode:

    public ListNode firstToLast (){

        ListNode current = front;

        // Sørger for at der kun sker noget hvis der er 1+ elementer.
        if (front != null){
            // hopper ned i bagenden af alle nodesne.
            while (current.next != null){
                current = current.next;
            }
            // indsætter value fra noden i front til bagerste node.
            current.next = new ListNode(front.data);
            // sletter første node ved at delinke den.
            // SKAL ske i denne rækkefølge da første node ikke kan linkes til bagenden hvis den først er blevet delinked.
            front = front.next;
        }
        return current;
    }
     */


}
