

class Selection_sort {
  
val arr=Array(64,25,12,22,11)
  val n=arr.length
  
  def show(){
  for(i<-0 to n-1)
  {
    var min_index=i
    for(j<-i+1 to n-1)
    {
      if(arr(j)<arr(min_index))
      {
        min_index=j
      }
     }
        val temp=arr(min_index)
        arr(min_index)=arr(i)
        arr(i)=temp
    }
  
  for(i<-0 to n-1)
    println(arr(i))
    
  }
}

object test{
  def main(args:Array[String]){
    val obj =new Selection_sort
    obj.show
  }
}