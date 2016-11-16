/**
 * FatturaModel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.alfasoft.fabrizio;

public class FatturaModel  implements java.io.Serializable {
    private java.lang.String codCliente;

    private java.lang.String ragSociale;

    private double totale;

    public FatturaModel() {
    }

    public FatturaModel(
           java.lang.String codCliente,
           java.lang.String ragSociale,
           double totale) {
           this.codCliente = codCliente;
           this.ragSociale = ragSociale;
           this.totale = totale;
    }


    /**
     * Gets the codCliente value for this FatturaModel.
     * 
     * @return codCliente
     */
    public java.lang.String getCodCliente() {
        return codCliente;
    }


    /**
     * Sets the codCliente value for this FatturaModel.
     * 
     * @param codCliente
     */
    public void setCodCliente(java.lang.String codCliente) {
        this.codCliente = codCliente;
    }


    /**
     * Gets the ragSociale value for this FatturaModel.
     * 
     * @return ragSociale
     */
    public java.lang.String getRagSociale() {
        return ragSociale;
    }


    /**
     * Sets the ragSociale value for this FatturaModel.
     * 
     * @param ragSociale
     */
    public void setRagSociale(java.lang.String ragSociale) {
        this.ragSociale = ragSociale;
    }


    /**
     * Gets the totale value for this FatturaModel.
     * 
     * @return totale
     */
    public double getTotale() {
        return totale;
    }


    /**
     * Sets the totale value for this FatturaModel.
     * 
     * @param totale
     */
    public void setTotale(double totale) {
        this.totale = totale;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FatturaModel)) return false;
        FatturaModel other = (FatturaModel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codCliente==null && other.getCodCliente()==null) || 
             (this.codCliente!=null &&
              this.codCliente.equals(other.getCodCliente()))) &&
            ((this.ragSociale==null && other.getRagSociale()==null) || 
             (this.ragSociale!=null &&
              this.ragSociale.equals(other.getRagSociale()))) &&
            this.totale == other.getTotale();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCodCliente() != null) {
            _hashCode += getCodCliente().hashCode();
        }
        if (getRagSociale() != null) {
            _hashCode += getRagSociale().hashCode();
        }
        _hashCode += new Double(getTotale()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FatturaModel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fabrizio.alfasoft.it", "FatturaModel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fabrizio.alfasoft.it", "codCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ragSociale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fabrizio.alfasoft.it", "ragSociale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fabrizio.alfasoft.it", "totale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
