datatype intonil = Nil | Int of int;
type ambiente = string -> intonil;

val ambientevuoto = fn _ => Nil;

val rec lega = fn amb:ambiente =>
		  fn nome =>
		     fn valore =>
			(fn n => if n = nome then Int(valore) else  amb n):ambiente;

