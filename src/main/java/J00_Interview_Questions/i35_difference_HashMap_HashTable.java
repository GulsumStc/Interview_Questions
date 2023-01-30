package J00_Interview_Questions;

public class i35_difference_HashMap_HashTable {



    /*

    Interview:
    Differences between HashMap and HashTable

1-  a- HashMap is NOT synchronized  and multi-thread(thread-safe)
    b- HashTable is Synchronized and  Thread Safe
2-  a- HashMap is fast
    b- HashTable is slow according to HashMap
3-  a- For values you can use "MULTIPLE null" values
    b- For HashTables, you cannot use "null" for keys and values.




     */


    /*
	 1)HashMap is NOT synchronized
	 2)HashMap is NOT multi-thread(thread-safe)
	 3)HashMap uses key-value structure(key==>Must be unique   value==>Allows duplication)
	 4)For keys you can use "null" values JUST ONCE in a HashMap
	 5)For values you can use "MULTIPLE null" values
	 6)HashMap is fast
	 7)HashMap does not put elements in any order.
	   Elements are in random order
	*/

    /*
	 1)HashTable uses key-value structure
	 2)HashTable is Synchronized
	 3)HashTable is Thread Safe
	 4)HashTable is not ordered
	 5)For HashTables, you cannot use "null" for keys and values.
	 6)HashTable is slow according to HashMap
	  7)HashMap does not put elements in any order.
	   Elements are in random order
	 */



/*
        HashMap:

        Map'lerde depoladiginiz her bir data'ya "Entry" denir, "Eleman" denmez.
        "Entry" ler "unique" dir cunku key kisimlari unique oldugundan her bir "Entry" digerlerinden farklidir.
        "HashMap" cok hizlidir cunku "HashMap" ler "entry" leri siralamak ile ugrasmazlar.
        "HashMap" lerde bir tane "key" i "null" yapabilirsiniz.
        "HashMap'ler de birden fazla value'u "null" yapabilirsiniz.
        "HashMap" ler "multi thread" icin kullanilamaz ve "synchronization" yoktur.

         HashTable:

        1)HashTable "thread-safe" ve "synchronized" dir.
        2)HashTable entry'leri rastgele siralar.
        3)HashTable'lar HashMap'lere gore daha yavastirlar.
        4)HashTable'lar "key" lerde ve "value" larda "null" kullanilmasina musaade etmezler.

        Note:"Multi-thread" ve "synchronization" kullanmaniz gerekirse ve "key" ve "value" larda "null" kullanmak
        yasak ise HasTable kullanmak gerekir.



 */


}
