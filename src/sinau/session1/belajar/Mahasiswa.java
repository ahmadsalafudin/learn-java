package javabasic.session1.belajar;

public class Mahasiswa implements Comparable<Object> {
	private Integer nim;
	private String nama;
	public Integer getNim() {
		return nim;
	}
	public void setNim(Integer nim) {
		this.nim = nim;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Mahasiswa m = (Mahasiswa) arg0;
		return getNim().compareTo(m.getNim());
	}
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nim == null) ? 0 : nim.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false; 
		if (getClass() != obj.getClass())
			return false;
		Mahasiswa other = (Mahasiswa) obj;
		if (nim == null) {
			if (other.nim != null)
				return false;
		} else if (!nim.equals(other.nim))
			return false;
		return true;	
	}

}
