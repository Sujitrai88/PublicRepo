public class OddEvenLinkedList {
	
	Node head = null;
	Node tail = null;
	class Node
	{
		int data ;
		Node nextNode = null;
		
		Node(int data)
		{
			this.data= data;
		}
	}
	
	public void add( int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else {
			tail.nextNode = newNode;
			tail = tail.nextNode;
		}
	}

	
	void print(OddEvenLinkedList m)
	{	Node node =m.head;
		while(node != null)
		{
			System.out.print(node.data+",");
			node = node.nextNode;
		}
	}
	
	public static void main(String[] args) {
		OddEvenLinkedList ml = new OddEvenLinkedList();
		ml.add(01);
		ml.add(11);
		ml.add(21);
		ml.add(31);
		ml.add(41);
		ml.add(51);
		ml.add(61);
		ml.add(71);
		ml.add(81);
		ml.add(91);
		
		
			Node node =ml.head;
			Node oddHead =null;
			Node oddTail= null;
			Node evenHead =null;
			Node evenTail= null;
			while(node!=null)
			{
				if(node.data%2==0)
				{
					if(evenHead==null)
						{evenHead=node;
						evenTail=evenHead;}
					else {
					evenTail.nextNode= new OddEvenLinkedList().new Node(node.data);
					evenTail = evenTail.nextNode;
					}
				}
				else
				{
						if(oddHead==null)
							{oddHead=node;
							oddTail=oddHead;}
						else {
						oddTail.nextNode=new OddEvenLinkedList().new Node(node.data);
						oddTail = oddTail.nextNode;
						}
				}
				node=node.nextNode;
			}
					
			if(oddTail == null && evenHead != null)
			{oddHead=evenHead;}
			else 
			{oddTail.nextNode=evenHead;}
			
			ml.head=oddHead;
			ml.tail=evenTail!=null?evenTail:oddTail;
			System.out.println("printing odd then even elements");
			ml.print(ml);
	}
}
