package de.timherbst.wau.domain.auswertung;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class MannschaftsAuswertungBean {
	private String wettkampf;
	private String art;
	private String modus;
	private String jahrgaenge;
	private JRBeanCollectionDataSource listEinzel;
	private JRBeanCollectionDataSource listMannschaft;

	public MannschaftsAuswertungBean(String wettkampf, String art, String modus, String jahrgaenge, JRBeanCollectionDataSource listEinzel, JRBeanCollectionDataSource listMannschaft) {
		super();

		this.wettkampf = wettkampf;
		this.art = art;
		this.modus = modus;
		this.jahrgaenge = jahrgaenge;
		this.listEinzel = listEinzel;
		this.listMannschaft = listMannschaft;
	}

	public String getWettkampf() {
		return wettkampf;
	}

	public void setWettkampf(String wettkampf) {
		this.wettkampf = wettkampf;
	}

	public String getArt() {
		return art;
	}

	public void setArt(String art) {
		this.art = art;
	}

	public String getModus() {
		return modus;
	}

	public void setModus(String modus) {
		this.modus = modus;
	}

	public String getJahrgaenge() {
		return jahrgaenge;
	}

	public void setJahrgaenge(String jahrgaenge) {
		this.jahrgaenge = jahrgaenge;
	}

	public JRBeanCollectionDataSource getListEinzel() {
		return listEinzel;
	}

	public void setListEinzel(JRBeanCollectionDataSource listEinzel) {
		this.listEinzel = listEinzel;
	}

	public JRBeanCollectionDataSource getListMannschaft() {
		return listMannschaft;
	}

	public void setListMannschaft(JRBeanCollectionDataSource listMannschaft) {
		this.listMannschaft = listMannschaft;
	}

}
