

object binary_search {
  
def binary_search(arr: Array[Int],Element_to_Search: Int) (l: Int = 0, h: Int = arr.length - 1): Int = 
{ 
      
                           
    if (l > h)  
        return -1
      
    
    var mid = l + (h - l) / 2
      
    
    if (arr(mid) == Element_to_Search) 
        return mid 
      
    
    else if (arr(mid) > Element_to_Search) 
        return binary_search(arr,  
               Element_to_Search)(l, mid - 1) 
      
    
    else
        return binary_search(arr,  
               Element_to_Search)(mid + 1, h) 
} 
  

def main(args: Array[String]){ 
   
    var in = binary_search(Array(1, 2, 3, 4, 55,  
                                            65, 75), 4)(0, 6); 
      
    
    if(in == -1) 
       print("Not Found") 
          
    
    else
       print("Element at " + in) 
} 
}