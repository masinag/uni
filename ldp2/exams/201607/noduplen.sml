val rec noduplen = fn [] => 0
  | a::l => if List.exists (fn b => b = a) l then noduplen l else 1 + noduplen l;  
