package codes;

import java.util.Scanner;

public class TreeBuilder {
	
	Tree root;
	String text = "";
	
	public void add(int value){
		Tree newNode, current;
		newNode = new Tree(value);
		if(root==null){
			root = newNode;
			current = root;
		}else{
			current = root;
			while(current.leftNode !=null || current.rightNode!=null){
				if(newNode.key<current.key){
					if(current.leftNode!=null){
						current = current.leftNode;
					}else{
						break;
					}
				}else{
					if(current.rightNode!=null){
						current = current.rightNode;
					}else{
						break;
					}
				}
			}
			if(newNode.key<current.key){
				current.leftNode=newNode;
			}else{
				current.rightNode = newNode;
			}
		}
	}
	
	public void inorder(Tree root){
        if (root != null) {
        	text = text + "(";
        	//System.out.print("(");
            inorder(root.leftNode);
            text =  text + "," + root.key + ",";
            //System.out.print(root.key+",");
            inorder(root.rightNode);
            text = text + ")";
            //System.out.print(")");
        }else{
        	text = text + "-";
        	//System.out.print("-");
        }
    }
	
	public String getText(){
		//text = text.replaceAll("-,\\)", "-\\)");
		return text;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		TreeBuilder myTree = new TreeBuilder();
		int range = sc.nextInt();
		for(int i =0; i<range;i++){
			myTree.add(sc.nextInt());
		}
		myTree.inorder(myTree.root);
		System.out.println(myTree.getText());
	}
	
	

}

class Tree{
	public int key;
	Tree leftNode;
	Tree rightNode;
	
	public Tree(int key) {
		// TODO Auto-generated constructor stub
		leftNode = null;
		rightNode = null;
		this.key = key;
	}
}
