package org.zhouhy.structure.linkedlist.demo02;

import org.zhouhy.structure.linkedlist.demo02.node.BiDirectionHeroNode;

public class BiDirectionLinkedList {
    
    private BiDirectionHeroNode biDirectionHeroNode;
    
    public boolean isEmpty(){
        return biDirectionHeroNode == null;
    }
    
    public int size(){
        int size = 0;
        if(this.isEmpty()){
            return size;
        }
        BiDirectionHeroNode tempNode = biDirectionHeroNode.getNext();
        while(true){            
            size++;
            if(tempNode.equals(biDirectionHeroNode)){
                break;
            }
            tempNode = tempNode.getNext();
        }      
        return size;
    }
    
    public void add(BiDirectionHeroNode node){
        if(this.isEmpty()){
            this.biDirectionHeroNode = node;
            this.biDirectionHeroNode.setNext(this.biDirectionHeroNode);
            this.biDirectionHeroNode.setPrevious(this.biDirectionHeroNode);
            return;
        }
        
        BiDirectionHeroNode tempNode = biDirectionHeroNode.getNext();
        while(true){
            if(tempNode.getNext() == biDirectionHeroNode){
                break;
            }
            tempNode = tempNode.getNext();
        }        
        tempNode.setNext(node);
        biDirectionHeroNode.setPrevious(node);
        node.setNext(biDirectionHeroNode);
        node.setPrevious(tempNode);
    }
    
    public BiDirectionHeroNode get(int index){
        int size = this.size();       
        if(size-1>=index){
            int iterator = 0;
            BiDirectionHeroNode tempNode = this.biDirectionHeroNode;
            while(true){
               if(iterator == index){
                   break;
               }
               tempNode = tempNode.getNext();
               iterator++;
            }
            return tempNode;
        }else{
            throw new ArrayIndexOutOfBoundsException("数组越界");
        }       
    }

    public void remove(int index){
        int size = this.size();
        if(size-1>=index){
            BiDirectionHeroNode tempNode = this.get(index);
            BiDirectionHeroNode pre = tempNode.getPrevious();
            BiDirectionHeroNode next = tempNode.getNext();
            pre.setNext(next);
            next.setPrevious(pre);
            if(tempNode.equals(biDirectionHeroNode)){
                this.biDirectionHeroNode = next;
            }
        }else{
            throw new ArrayIndexOutOfBoundsException("数组越界");
        }
    }
    
    public void list(){
        if(!this.isEmpty()){
            BiDirectionHeroNode tempNode = this.biDirectionHeroNode;
            while(true){
                System.out.println(tempNode);
                if(tempNode.getNext().equals(biDirectionHeroNode)){
                    break;
                }
                tempNode = tempNode.getNext();
            }
        }
    }
    
}
