package db;

// Generated Apr 7, 2015 10:37:15 PM by Hibernate Tools 4.3.1

import java.util.Date;

/**
 * Titles generated by hbm2java
 */
public class Titles implements java.io.Serializable {

	private TitlesId id;
	private Date toDate;

	public Titles() {
	}

	public Titles(TitlesId id) {
		this.id = id;
	}

	public Titles(TitlesId id, Date toDate) {
		this.id = id;
		this.toDate = toDate;
	}

	public TitlesId getId() {
		return this.id;
	}

	public void setId(TitlesId id) {
		this.id = id;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

}
