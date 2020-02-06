package todolist;
import java.util.ArrayList;
import java.util.Scanner;

public class Todo{
  private static ArrayList<String> myList= new ArrayList<String>();


  public static void main(String[] args){
    System.out.println("This is a to do list program");
    Scanner input = new Scanner(System.in);
    System.out.println("Hit enter to continue, then an instruction \n" +
      "Enter 'add' to add a task to your to do list \n" +
      "Enter 'print' to display your to do list on the screen \n" +
      "Enter 'remove' to remove an item from your list \n" +
      "Enter 0 to end program");
    String end = input.nextLine();
    while(end.equals("0") == false){
      if(end.equalsIgnoreCase("add")){
        System.out.println("What do you want to add?");
        addItem(input.nextLine());
        System.out.println("Enter another instruction");
      }
      else if(end.equalsIgnoreCase("print")){
        showList();
        System.out.println("Enter another instruction");
      }
      else if(end.equalsIgnoreCase("remove")){
        removeItem();
        System.out.println("Enter another instruction");
      }
      end = input.nextLine();

    }

  }

  public static void addItem(String task){
    myList.add(task);
  }

  public static void showList(){
    System.out.println("TODO: ");
    for(int i = 0; i < myList.size(); i++){
      System.out.println((i+1) + ": " + myList.get(i));
    }
  }

  public static void removeItem(){
    System.out.println("Enter the number from the list of the task you want to delete: ");
    Scanner inputs = new Scanner(System.in);
    int index = Integer.parseInt(inputs.nextLine());
    myList.remove(index - 1);
  }

}
