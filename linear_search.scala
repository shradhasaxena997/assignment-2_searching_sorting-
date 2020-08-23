

class linear_search {
  
 val arr=Array(5,8,6,7,2)
    val num=7
    val r=arr.length
  def add(){
    
    
    for(i<-0 to r-1)
    {
      if(arr(i)==num)
        println(i)
    }
    
 }
}

object k{
  def main(args:Array[String]){
    var obj =new linear_search
    obj.add
  }
}