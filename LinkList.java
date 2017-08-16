
public class LinkList {
	private Link first;
	public LinkList(){
		first=null;
	}
	public boolean isEmpty(){
		return (first==null);
	}
	public void insertFirst(int id){
		Link newLink = new Link(id);
		newLink.next=first;
		first=newLink;
	}
	public Link deleteFirst(){
		Link temp=first;
		first=first.next;
		return temp;
	}
	public void insertToLocation(Link myNode,int location){
		Link temp=first;
		int counter=1;
		if(location!=1){
		while(temp!=null&&location-1!=counter){
			temp=temp.next;
			counter++;
		}
		myNode.next=temp.next;
		temp.next=myNode;
		}
		else {
			myNode.next=first;
			first=myNode;
		}
	}
	public void displayList(){
		System.out.println("List (first-->last): ");
		Link current=first;
		while(current != null){
			current.displayLink();
			current=current.next;
		}
		System.out.println("");
	}

}
