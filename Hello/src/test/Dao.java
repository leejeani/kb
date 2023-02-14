package test;

import java.util.List;

public interface Dao<K,V>{
	
	public int insert(V v) throws Exception;
	public int delete(K k) throws Exception;
	public int update(V v) throws Exception;
	public V select(K k) throws Exception;
	public List<V> select() throws Exception;
}	
