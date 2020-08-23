

class Bubble_sort {
  
val arr=Array(12,11,13,5,6)
  val n=arr.length
  def sort()
  {
    for(i<-0 to n-2)
    {
      for(j<-0 to n-i-2)
      {
        if(arr(j)>arr(j+1))
        {
          val temp =arr(j)
          arr(j)=arr(j+1)
          arr(j+1)=temp
        }
      }
    }
    
    for(i<-0 to n-1)
    {
      println(arr(i))
    }
    
  }
}

object show{
  def main(args:Array[String]){
    val obj=new Bubble_sort
    obj.sort
  }
}