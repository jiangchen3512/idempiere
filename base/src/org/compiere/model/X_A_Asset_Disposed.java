/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;

/** Generated Model for A_Asset_Disposed
 *  @author Adempiere (generated) 
 *  @version Release 3.5.2a - $Id$ */
public class X_A_Asset_Disposed extends PO implements I_A_Asset_Disposed, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_A_Asset_Disposed (Properties ctx, int A_Asset_Disposed_ID, String trxName)
    {
      super (ctx, A_Asset_Disposed_ID, trxName);
      /** if (A_Asset_Disposed_ID == 0)
        {
			setA_Asset_Disposed_ID (0);
			setA_Asset_ID (0);
			setA_Disposed_Date (new Timestamp( System.currentTimeMillis() ));
			setA_Disposed_Method (null);
			setA_Disposed_Reason (null);
			setC_Period_ID (0);
			setDateAcct (new Timestamp( System.currentTimeMillis() ));
// @Date@
			setDateDoc (new Timestamp( System.currentTimeMillis() ));
// @Date@
			setProcessed (false);
			setProcessing (false);
        } */
    }

    /** Load Constructor */
    public X_A_Asset_Disposed (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 7 - System - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_A_Asset_Disposed[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set A_Asset_Disposed_ID.
		@param A_Asset_Disposed_ID A_Asset_Disposed_ID	  */
	public void setA_Asset_Disposed_ID (int A_Asset_Disposed_ID)
	{
		if (A_Asset_Disposed_ID < 1)
			 throw new IllegalArgumentException ("A_Asset_Disposed_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_A_Asset_Disposed_ID, Integer.valueOf(A_Asset_Disposed_ID));
	}

	/** Get A_Asset_Disposed_ID.
		@return A_Asset_Disposed_ID	  */
	public int getA_Asset_Disposed_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_Disposed_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getA_Asset_Disposed_ID()));
    }

	/** Set Asset.
		@param A_Asset_ID 
		Asset used internally or by customers
	  */
	public void setA_Asset_ID (int A_Asset_ID)
	{
		if (A_Asset_ID < 1)
			 throw new IllegalArgumentException ("A_Asset_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
	}

	/** Get Asset.
		@return Asset used internally or by customers
	  */
	public int getA_Asset_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** A_Asset_Trade_ID AD_Reference_ID=53258 */
	public static final int A_ASSET_TRADE_ID_AD_Reference_ID=53258;
	/** Set A_Asset_Trade_ID.
		@param A_Asset_Trade_ID A_Asset_Trade_ID	  */
	public void setA_Asset_Trade_ID (int A_Asset_Trade_ID)
	{
		if (A_Asset_Trade_ID < 1) 
			set_Value (COLUMNNAME_A_Asset_Trade_ID, null);
		else 
			set_Value (COLUMNNAME_A_Asset_Trade_ID, Integer.valueOf(A_Asset_Trade_ID));
	}

	/** Get A_Asset_Trade_ID.
		@return A_Asset_Trade_ID	  */
	public int getA_Asset_Trade_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_Trade_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set A_Disposed_Date.
		@param A_Disposed_Date A_Disposed_Date	  */
	public void setA_Disposed_Date (Timestamp A_Disposed_Date)
	{
		if (A_Disposed_Date == null)
			throw new IllegalArgumentException ("A_Disposed_Date is mandatory.");
		set_Value (COLUMNNAME_A_Disposed_Date, A_Disposed_Date);
	}

	/** Get A_Disposed_Date.
		@return A_Disposed_Date	  */
	public Timestamp getA_Disposed_Date () 
	{
		return (Timestamp)get_Value(COLUMNNAME_A_Disposed_Date);
	}

	/** A_Disposed_Method AD_Reference_ID=53270 */
	public static final int A_DISPOSED_METHOD_AD_Reference_ID=53270;
	/** Cash = C */
	public static final String A_DISPOSED_METHOD_Cash = "C";
	/** Simple = S */
	public static final String A_DISPOSED_METHOD_Simple = "S";
	/** Trade = T1 */
	public static final String A_DISPOSED_METHOD_Trade = "T1";
	/** Trade w/cash = T2 */
	public static final String A_DISPOSED_METHOD_TradeWCash = "T2";
	/** Set A_Disposed_Method.
		@param A_Disposed_Method A_Disposed_Method	  */
	public void setA_Disposed_Method (String A_Disposed_Method)
	{
		if (A_Disposed_Method == null) throw new IllegalArgumentException ("A_Disposed_Method is mandatory");
		if (A_Disposed_Method.equals("C") || A_Disposed_Method.equals("S") || A_Disposed_Method.equals("T1") || A_Disposed_Method.equals("T2")); else throw new IllegalArgumentException ("A_Disposed_Method Invalid value - " + A_Disposed_Method + " - Reference_ID=53270 - C - S - T1 - T2");		set_Value (COLUMNNAME_A_Disposed_Method, A_Disposed_Method);
	}

	/** Get A_Disposed_Method.
		@return A_Disposed_Method	  */
	public String getA_Disposed_Method () 
	{
		return (String)get_Value(COLUMNNAME_A_Disposed_Method);
	}

	/** A_Disposed_Reason AD_Reference_ID=53269 */
	public static final int A_DISPOSED_REASON_AD_Reference_ID=53269;
	/** Charity = C */
	public static final String A_DISPOSED_REASON_Charity = "C";
	/** Destroyed = D */
	public static final String A_DISPOSED_REASON_Destroyed = "D";
	/** Scraped = S */
	public static final String A_DISPOSED_REASON_Scraped = "S";
	/** Sold = S1 */
	public static final String A_DISPOSED_REASON_Sold = "S1";
	/** Sold w/Trade = S2 */
	public static final String A_DISPOSED_REASON_SoldWTrade = "S2";
	/** Theft = T */
	public static final String A_DISPOSED_REASON_Theft = "T";
	/** Set A_Disposed_Reason.
		@param A_Disposed_Reason A_Disposed_Reason	  */
	public void setA_Disposed_Reason (String A_Disposed_Reason)
	{
		if (A_Disposed_Reason == null) throw new IllegalArgumentException ("A_Disposed_Reason is mandatory");
		if (A_Disposed_Reason.equals("C") || A_Disposed_Reason.equals("D") || A_Disposed_Reason.equals("S") || A_Disposed_Reason.equals("S1") || A_Disposed_Reason.equals("S2") || A_Disposed_Reason.equals("T")); else throw new IllegalArgumentException ("A_Disposed_Reason Invalid value - " + A_Disposed_Reason + " - Reference_ID=53269 - C - D - S - S1 - S2 - T");		set_Value (COLUMNNAME_A_Disposed_Reason, A_Disposed_Reason);
	}

	/** Get A_Disposed_Reason.
		@return A_Disposed_Reason	  */
	public String getA_Disposed_Reason () 
	{
		return (String)get_Value(COLUMNNAME_A_Disposed_Reason);
	}

	/** Set A_Proceeds.
		@param A_Proceeds A_Proceeds	  */
	public void setA_Proceeds (BigDecimal A_Proceeds)
	{
		set_Value (COLUMNNAME_A_Proceeds, A_Proceeds);
	}

	/** Get A_Proceeds.
		@return A_Proceeds	  */
	public BigDecimal getA_Proceeds () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_A_Proceeds);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** C_Period_ID AD_Reference_ID=233 */
	public static final int C_PERIOD_ID_AD_Reference_ID=233;
	/** Set Period.
		@param C_Period_ID 
		Period of the Calendar
	  */
	public void setC_Period_ID (int C_Period_ID)
	{
		if (C_Period_ID < 1)
			 throw new IllegalArgumentException ("C_Period_ID is mandatory.");
		set_Value (COLUMNNAME_C_Period_ID, Integer.valueOf(C_Period_ID));
	}

	/** Get Period.
		@return Period of the Calendar
	  */
	public int getC_Period_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Period_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Account Date.
		@param DateAcct 
		Accounting Date
	  */
	public void setDateAcct (Timestamp DateAcct)
	{
		if (DateAcct == null)
			throw new IllegalArgumentException ("DateAcct is mandatory.");
		set_Value (COLUMNNAME_DateAcct, DateAcct);
	}

	/** Get Account Date.
		@return Accounting Date
	  */
	public Timestamp getDateAcct () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateAcct);
	}

	/** Set Document Date.
		@param DateDoc 
		Date of the Document
	  */
	public void setDateDoc (Timestamp DateDoc)
	{
		if (DateDoc == null)
			throw new IllegalArgumentException ("DateDoc is mandatory.");
		set_Value (COLUMNNAME_DateDoc, DateDoc);
	}

	/** Get Document Date.
		@return Date of the Document
	  */
	public Timestamp getDateDoc () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateDoc);
	}

	/** Set Processed.
		@param Processed 
		The document has been processed
	  */
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed () 
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Process Now.
		@param Processing Process Now	  */
	public void setProcessing (boolean Processing)
	{
		set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
	}

	/** Get Process Now.
		@return Process Now	  */
	public boolean isProcessing () 
	{
		Object oo = get_Value(COLUMNNAME_Processing);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}
}