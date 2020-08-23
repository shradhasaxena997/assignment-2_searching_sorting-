

class Insertion_sort {
  
val arr=Array(12,11,13,5,6)
  val n=arr.length
  
  
 def add(){
    for(i<-1 to n-1)
    {
      val key=arr(i)
      var j=i-1
      
      while(j>=0 && arr(j)> key)
      {
        arr(j+1)=arr(j)
        j=j-1
      }
      arr(j+1)=key
    }
    
   
    
    for(i<-0 to n-1)
      println(arr(i))
  
}

}




object hello{
  def main(args:Array[String]){
    val obj=new Insertion_sort
    obj.add
  }
}