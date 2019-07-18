package sinau.session3.belajar.bangundatar;

public class PersegiPanjang implements BangunDatar {

	private double panjang;
	private double lebar;
	
	public double getPanjang() {
		return panjang;
	}

	public void setPanjang(double panjang) {
		this.panjang = panjang;
	}

	public double getLebar() {
		return lebar;
	}

	public void setLebar(double lebar) {
		this.lebar = lebar;
	}

	@Override
	public double hitungLuas() {
		return panjang * lebar;
	}

}
