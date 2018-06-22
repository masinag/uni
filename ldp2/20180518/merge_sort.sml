fun merge_sort list f =
    let
	fun merge (l1, l2) =
	    case (l1, l2) of
		([], l2) => l2
	      | (l1, []) => l1
	      | (a::l1, b::l2) => if f(a, b) then a::merge(l1, b::l2)
				  else b::merge(a::l1, l2)
    in
	
	if(length list) <= 1 then list
	else
	    merge(merge_sort(List.take(list, length(list) div 2)) f,
		  merge_sort(List.drop(list, length(list) div 2)) f)
    end;

fun le (a, b) =  a <= b;

fun m (a, b) = a mod b > 0; 

val a =
merge_sort [1,2,5,4,6,8,99,1] le;

val b =
merge_sort [4,2,8,4,32,128,16,64,2] m;


