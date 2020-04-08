/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.twitter.scrooge.test.gold.thriftjava;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

import com.twitter.finagle.AbstractFailureFlags;
import com.twitter.finagle.JavaFailureFlags;
import com.twitter.scrooge.ThriftStructIface;
import com.twitter.scrooge.TFieldBlob;

// No additional import required for struct/union.

public class AnotherException extends AbstractFailureFlags<AnotherException> implements TBase<AnotherException, AnotherException._Fields>, java.io.Serializable, Cloneable, ThriftStructIface {
  private static final TStruct STRUCT_DESC = new TStruct("AnotherException");

  private static final TField ERROR_CODE_FIELD_DESC = new TField("errorCode", TType.I32, (short)1);


  public int errorCode;
  private Map<Short, TFieldBlob> passThroughFields;

  private long _flags;

  /** The set of fields this object contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    ERROR_CODE((short)1, "errorCode");
  
    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();
  
    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }
  
    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ERROR_CODE
          return ERROR_CODE;
        default:
          return null;
      }
    }
  
    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }
  
    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }
  
    private final short _thriftId;
    private final String _fieldName;
  
    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }
  
    public short getThriftFieldId() {
      return _thriftId;
    }
  
    public String getFieldName() {
      return _fieldName;
    }
  }


  // isset id assignments
  private static final int __ERRORCODE_ISSET_ID = 0;
  private final BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  
  /**
   * FieldValueMetaData.type returns TType.STRING for both string and binary field values.
   * This set can be used to determine if a FieldValueMetaData with type TType.STRING is actually
   * declared as binary in the idl file.
   */
  public static final Set<FieldValueMetaData> binaryFieldValueMetaDatas;
  
  private static FieldValueMetaData registerBinaryFieldValueMetaData(FieldValueMetaData f, Set<FieldValueMetaData> binaryFieldValues) {
    binaryFieldValues.add(f);
    return f;
  }
  
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    Set<FieldValueMetaData> tmpSet = new HashSet<FieldValueMetaData>();
    tmpMap.put(_Fields.ERROR_CODE, new FieldMetaData("errorCode", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    binaryFieldValueMetaDatas = Collections.unmodifiableSet(tmpSet);
    FieldMetaData.addStructMetaDataMap(AnotherException.class, metaDataMap);
  }

  /**
   * Returns a map of the annotations and their values for this struct declaration.
   * See fieldAnnotations or valueAnnotations for the annotations attached to struct fields
   * or enum values.
   */
  public static final Map<String, String> structAnnotations;
  static {
    structAnnotations = Collections.emptyMap();
  }

  /**
   * Returns a map of the annotations for each of this struct's fields, keyed by the field.
   * See structAnnotations for the annotations attached to this struct's declaration.
   */
  public static final Map<_Fields, Map<String, String>> fieldAnnotations;
  static {
    fieldAnnotations = Collections.emptyMap();
  }

  /**
   * Returns the set of fields that have a configured default value.
   * The default values for these fields can be obtained by
   * instantiating this class with the default constructor.
   */
  public static final Set<_Fields> hasDefaultValue;
  static {
    Set<_Fields> tmp = EnumSet.noneOf(_Fields.class);
    hasDefaultValue = Collections.unmodifiableSet(tmp);
  }


  public AnotherException() {
    this._flags = JavaFailureFlags.EMPTY;
  }

  public AnotherException(
    int errorCode)
  {
    this();
    this.errorCode = errorCode;
    setErrorCodeIsSet(true);
    this._flags = JavaFailureFlags.EMPTY;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AnotherException(AnotherException other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.errorCode = other.errorCode;
    this.passThroughFields = other.passThroughFields;
    this._flags = other._flags;
  }

  public long flags() {
    return _flags;
  }

  public AnotherException copyWithFlags(long flags) {
    AnotherException copied = deepCopy();
    copied._flags = flags;
    return copied;
  }

  public static List<String> validateNewInstance(AnotherException item) {
    final List<String> buf = new ArrayList<String>();

    return buf;
  }

  public AnotherException deepCopy() {
    return new AnotherException(this);
  }

  @java.lang.Override
  public void clear() {
    setErrorCodeIsSet(false);
    this.errorCode = 0;
    this.passThroughFields = null;
    this._flags = JavaFailureFlags.EMPTY;
  }

  public int getErrorCode() {
    return this.errorCode;
  }

  public AnotherException setErrorCode(int errorCode) {
    this.errorCode = errorCode;
    setErrorCodeIsSet(true);

    return this;
  }

  public void unsetErrorCode() {
  __isset_bit_vector.clear(__ERRORCODE_ISSET_ID);
  }

  /** Returns true if field errorCode is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorCode() {
    return __isset_bit_vector.get(__ERRORCODE_ISSET_ID);
  }

  public void setErrorCodeIsSet(boolean value) {
    __isset_bit_vector.set(__ERRORCODE_ISSET_ID, value);
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ERROR_CODE:
      if (value == null) {
        unsetErrorCode();
      } else {
        setErrorCode((Integer)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ERROR_CODE:
      return Integer.valueOf(getErrorCode());
    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ERROR_CODE:
      return isSetErrorCode();
    }
    throw new IllegalStateException();
  }

  @java.lang.Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AnotherException)
      return this.equals((AnotherException)that);
    return false;
  }

  public boolean equals(AnotherException that) {
    return equalsWithoutPassthrough(that) && passthroughFieldsAreEqual(that);
  }

  private boolean equalsWithoutPassthrough(AnotherException that) {
    if (that == null)
      return false;
    boolean this_present_errorCode = true;
    boolean that_present_errorCode = true;
    if (this_present_errorCode || that_present_errorCode) {
      if (!(this_present_errorCode && that_present_errorCode))
        return false;
      if (this.errorCode != that.errorCode)
        return false;
    }
    if (this._flags != that._flags)
      return false;
    return true;
  }

  private boolean passthroughFieldsAreEqual(AnotherException that) {
    if (that == null)
      return false;
    if (this.passThroughFields == null && that.passThroughFields != null)
      return false;
    if (this.passThroughFields == that.passThroughFields
        || this.passThroughFields.equals(that.passThroughFields))
      return true;
    return false;
  }

  @java.lang.Override
  public int hashCode() {
    int hashCode = 1;
    {
      hashCode = 31 * hashCode + ((Integer)errorCode).hashCode();
    }
    {
      hashCode = 31 * hashCode + Long.hashCode(this._flags);
    }
    return hashCode;
  }

  public int compareTo(AnotherException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    AnotherException typedOther = (AnotherException)other;

    lastComparison = Boolean.valueOf(isSetErrorCode()).compareTo(typedOther.isSetErrorCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorCode()) {
      lastComparison = TBaseHelper.compareTo(this.errorCode, typedOther.errorCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) {
        break;
      }
      switch (field.id) {
        case 1: // ERROR_CODE
          if (field.type == TType.I32) {
            this.errorCode = iprot.readI32();
            setErrorCodeIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          if (this.passThroughFields == null) {
            this.passThroughFields = new HashMap<Short, TFieldBlob>();
          }
          this.passThroughFields.put(field.id, TFieldBlob.extractBlob(field, iprot));
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();
    
    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(ERROR_CODE_FIELD_DESC);
    oprot.writeI32(this.errorCode);
    oprot.writeFieldEnd();
    if (this.passThroughFields != null) {
      for (TFieldBlob field : this.passThroughFields.values()) {
        field.write(oprot);
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @java.lang.Override
  public String toString() {
    StringBuilder sb = new StringBuilder("AnotherException(");
    boolean first = true;
    sb.append("errorCode:");
    sb.append(this.errorCode);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }
}

