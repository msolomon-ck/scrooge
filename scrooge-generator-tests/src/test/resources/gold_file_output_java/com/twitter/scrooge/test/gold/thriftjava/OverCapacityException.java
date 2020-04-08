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

public class OverCapacityException extends AbstractFailureFlags<OverCapacityException> implements TBase<OverCapacityException, OverCapacityException._Fields>, java.io.Serializable, Cloneable, ThriftStructIface {
  private static final TStruct STRUCT_DESC = new TStruct("OverCapacityException");

  private static final TField CHILL_TIME_SECONDS_FIELD_DESC = new TField("chillTimeSeconds", TType.I32, (short)1);


  public int chillTimeSeconds;
  private Map<Short, TFieldBlob> passThroughFields;

  private long _flags;

  /** The set of fields this object contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    CHILL_TIME_SECONDS((short)1, "chillTimeSeconds");
  
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
        case 1: // CHILL_TIME_SECONDS
          return CHILL_TIME_SECONDS;
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
  private static final int __CHILLTIMESECONDS_ISSET_ID = 0;
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
    tmpMap.put(_Fields.CHILL_TIME_SECONDS, new FieldMetaData("chillTimeSeconds", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    binaryFieldValueMetaDatas = Collections.unmodifiableSet(tmpSet);
    FieldMetaData.addStructMetaDataMap(OverCapacityException.class, metaDataMap);
  }

  /**
   * Returns a map of the annotations and their values for this struct declaration.
   * See fieldAnnotations or valueAnnotations for the annotations attached to struct fields
   * or enum values.
   */
  public static final Map<String, String> structAnnotations;
  static {
    Map<String, String> tmpMap = new HashMap<String, String>();
    tmpMap.put("e.annotation", "true");
    structAnnotations = Collections.unmodifiableMap(tmpMap);
  }

  /**
   * Returns a map of the annotations for each of this struct's fields, keyed by the field.
   * See structAnnotations for the annotations attached to this struct's declaration.
   */
  public static final Map<_Fields, Map<String, String>> fieldAnnotations;
  static {
    Map<_Fields, Map<String, String>> tmpMap = new EnumMap<_Fields, Map<String, String>>(_Fields.class);
      {
        Map<String, String> tmpFieldMap = new HashMap<String, String>();
        tmpFieldMap.put("e.field.annotation", "false");
        tmpMap.put(_Fields.CHILL_TIME_SECONDS, Collections.unmodifiableMap(tmpFieldMap));
      }
    fieldAnnotations = Collections.unmodifiableMap(tmpMap);
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


  public OverCapacityException() {
    this._flags = JavaFailureFlags.EMPTY;
  }

  public OverCapacityException(
    int chillTimeSeconds)
  {
    this();
    this.chillTimeSeconds = chillTimeSeconds;
    setChillTimeSecondsIsSet(true);
    this._flags = JavaFailureFlags.EMPTY;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public OverCapacityException(OverCapacityException other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.chillTimeSeconds = other.chillTimeSeconds;
    this.passThroughFields = other.passThroughFields;
    this._flags = other._flags;
  }

  public long flags() {
    return _flags;
  }

  public OverCapacityException copyWithFlags(long flags) {
    OverCapacityException copied = deepCopy();
    copied._flags = flags;
    return copied;
  }

  public static List<String> validateNewInstance(OverCapacityException item) {
    final List<String> buf = new ArrayList<String>();

    return buf;
  }

  public OverCapacityException deepCopy() {
    return new OverCapacityException(this);
  }

  @java.lang.Override
  public void clear() {
    setChillTimeSecondsIsSet(false);
    this.chillTimeSeconds = 0;
    this.passThroughFields = null;
    this._flags = JavaFailureFlags.EMPTY;
  }

  public int getChillTimeSeconds() {
    return this.chillTimeSeconds;
  }

  public OverCapacityException setChillTimeSeconds(int chillTimeSeconds) {
    this.chillTimeSeconds = chillTimeSeconds;
    setChillTimeSecondsIsSet(true);

    return this;
  }

  public void unsetChillTimeSeconds() {
  __isset_bit_vector.clear(__CHILLTIMESECONDS_ISSET_ID);
  }

  /** Returns true if field chillTimeSeconds is set (has been assigned a value) and false otherwise */
  public boolean isSetChillTimeSeconds() {
    return __isset_bit_vector.get(__CHILLTIMESECONDS_ISSET_ID);
  }

  public void setChillTimeSecondsIsSet(boolean value) {
    __isset_bit_vector.set(__CHILLTIMESECONDS_ISSET_ID, value);
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CHILL_TIME_SECONDS:
      if (value == null) {
        unsetChillTimeSeconds();
      } else {
        setChillTimeSeconds((Integer)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CHILL_TIME_SECONDS:
      return Integer.valueOf(getChillTimeSeconds());
    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CHILL_TIME_SECONDS:
      return isSetChillTimeSeconds();
    }
    throw new IllegalStateException();
  }

  @java.lang.Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof OverCapacityException)
      return this.equals((OverCapacityException)that);
    return false;
  }

  public boolean equals(OverCapacityException that) {
    return equalsWithoutPassthrough(that) && passthroughFieldsAreEqual(that);
  }

  private boolean equalsWithoutPassthrough(OverCapacityException that) {
    if (that == null)
      return false;
    boolean this_present_chillTimeSeconds = true;
    boolean that_present_chillTimeSeconds = true;
    if (this_present_chillTimeSeconds || that_present_chillTimeSeconds) {
      if (!(this_present_chillTimeSeconds && that_present_chillTimeSeconds))
        return false;
      if (this.chillTimeSeconds != that.chillTimeSeconds)
        return false;
    }
    if (this._flags != that._flags)
      return false;
    return true;
  }

  private boolean passthroughFieldsAreEqual(OverCapacityException that) {
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
      hashCode = 31 * hashCode + ((Integer)chillTimeSeconds).hashCode();
    }
    {
      hashCode = 31 * hashCode + Long.hashCode(this._flags);
    }
    return hashCode;
  }

  public int compareTo(OverCapacityException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    OverCapacityException typedOther = (OverCapacityException)other;

    lastComparison = Boolean.valueOf(isSetChillTimeSeconds()).compareTo(typedOther.isSetChillTimeSeconds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChillTimeSeconds()) {
      lastComparison = TBaseHelper.compareTo(this.chillTimeSeconds, typedOther.chillTimeSeconds);
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
        case 1: // CHILL_TIME_SECONDS
          if (field.type == TType.I32) {
            this.chillTimeSeconds = iprot.readI32();
            setChillTimeSecondsIsSet(true);
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
    oprot.writeFieldBegin(CHILL_TIME_SECONDS_FIELD_DESC);
    oprot.writeI32(this.chillTimeSeconds);
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
    StringBuilder sb = new StringBuilder("OverCapacityException(");
    boolean first = true;
    sb.append("chillTimeSeconds:");
    sb.append(this.chillTimeSeconds);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }
}

