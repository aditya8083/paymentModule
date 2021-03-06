/**
 * Autogenerated by Avro
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package com.coviam.payment.dto;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class PaymentStatusDTO extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    private static final long serialVersionUID = -5329355797718335297L;
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PaymentStatusDTO\",\"namespace\":\"com.tiket.paybook\",\"fields\":[{\"name\":\"superPnr\",\"type\":\"string\"},{\"name\":\"paymentId\",\"type\":\"string\"},{\"name\":\"status\",\"type\":\"string\"}]}");

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    private static SpecificData MODEL$ = new SpecificData();

    private static final BinaryMessageEncoder<PaymentStatusDTO> ENCODER =
            new BinaryMessageEncoder<PaymentStatusDTO>(MODEL$, SCHEMA$);

    private static final BinaryMessageDecoder<PaymentStatusDTO> DECODER =
            new BinaryMessageDecoder<PaymentStatusDTO>(MODEL$, SCHEMA$);

    /**
     * Return the BinaryMessageDecoder instance used by this class.
     */
    public static BinaryMessageDecoder<PaymentStatusDTO> getDecoder() {
        return DECODER;
    }

    /**
     * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
     * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
     */
    public static BinaryMessageDecoder<PaymentStatusDTO> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<PaymentStatusDTO>(MODEL$, SCHEMA$, resolver);
    }

    /** Serializes this PaymentStatusDTO to a ByteBuffer. */
    public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
        return ENCODER.encode(this);
    }

    /** Deserializes a PaymentStatusDTO from a ByteBuffer. */
    public static PaymentStatusDTO fromByteBuffer(
            java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    @Deprecated
    public java.lang.CharSequence superPnr;
    @Deprecated
    public java.lang.CharSequence paymentId;
    @Deprecated
    public java.lang.CharSequence status;

    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public PaymentStatusDTO() {
    }

    /**
     * All-args constructor.
     * @param superPnr The new value for superPnr
     * @param paymentId The new value for paymentId
     * @param status The new value for status
     */
    public PaymentStatusDTO(java.lang.CharSequence superPnr, java.lang.CharSequence paymentId, java.lang.CharSequence status) {
        this.superPnr = superPnr;
        this.paymentId = paymentId;
        this.status = status;
    }

    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }

    // Used by DatumWriter.  Applications should not call.
    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0:
                return superPnr;
            case 1:
                return paymentId;
            case 2:
                return status;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value = "unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0:
                superPnr = (java.lang.CharSequence) value$;
                break;
            case 1:
                paymentId = (java.lang.CharSequence) value$;
                break;
            case 2:
                status = (java.lang.CharSequence) value$;
                break;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    /**
     * Gets the value of the 'superPnr' field.
     * @return The value of the 'superPnr' field.
     */
    public java.lang.CharSequence getSuperPnr() {
        return superPnr;
    }

    /**
     * Sets the value of the 'superPnr' field.
     * @param value the value to set.
     */
    public void setSuperPnr(java.lang.CharSequence value) {
        this.superPnr = value;
    }

    /**
     * Gets the value of the 'paymentId' field.
     * @return The value of the 'paymentId' field.
     */
    public java.lang.CharSequence getPaymentId() {
        return paymentId;
    }

    /**
     * Sets the value of the 'paymentId' field.
     * @param value the value to set.
     */
    public void setPaymentId(java.lang.CharSequence value) {
        this.paymentId = value;
    }

    /**
     * Gets the value of the 'status' field.
     * @return The value of the 'status' field.
     */
    public java.lang.CharSequence getStatus() {
        return status;
    }

    /**
     * Sets the value of the 'status' field.
     * @param value the value to set.
     */
    public void setStatus(java.lang.CharSequence value) {
        this.status = value;
    }

    /**
     * Creates a new PaymentStatusDTO RecordBuilder.
     * @return A new PaymentStatusDTO RecordBuilder
     */
    public static PaymentStatusDTO.Builder newBuilder() {
        return new PaymentStatusDTO.Builder();
    }

    /**
     * Creates a new PaymentStatusDTO RecordBuilder by copying an existing Builder.
     * @param other The existing builder to copy.
     * @return A new PaymentStatusDTO RecordBuilder
     */
    public static PaymentStatusDTO.Builder newBuilder(PaymentStatusDTO.Builder other) {
        return new PaymentStatusDTO.Builder(other);
    }

    /**
     * Creates a new PaymentStatusDTO RecordBuilder by copying an existing PaymentStatusDTO instance.
     * @param other The existing instance to copy.
     * @return A new PaymentStatusDTO RecordBuilder
     */
    public static PaymentStatusDTO.Builder newBuilder(PaymentStatusDTO other) {
        return new PaymentStatusDTO.Builder(other);
    }

    /**
     * RecordBuilder for PaymentStatusDTO instances.
     */
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PaymentStatusDTO>
            implements org.apache.avro.data.RecordBuilder<PaymentStatusDTO> {

        private java.lang.CharSequence superPnr;
        private java.lang.CharSequence paymentId;
        private java.lang.CharSequence status;

        /** Creates a new Builder */
        private Builder() {
            super(SCHEMA$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         * @param other The existing Builder to copy.
         */
        private Builder(PaymentStatusDTO.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.superPnr)) {
                this.superPnr = data().deepCopy(fields()[0].schema(), other.superPnr);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.paymentId)) {
                this.paymentId = data().deepCopy(fields()[1].schema(), other.paymentId);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.status)) {
                this.status = data().deepCopy(fields()[2].schema(), other.status);
                fieldSetFlags()[2] = true;
            }
        }

        /**
         * Creates a Builder by copying an existing PaymentStatusDTO instance
         * @param other The existing instance to copy.
         */
        private Builder(PaymentStatusDTO other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0], other.superPnr)) {
                this.superPnr = data().deepCopy(fields()[0].schema(), other.superPnr);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.paymentId)) {
                this.paymentId = data().deepCopy(fields()[1].schema(), other.paymentId);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.status)) {
                this.status = data().deepCopy(fields()[2].schema(), other.status);
                fieldSetFlags()[2] = true;
            }
        }

        /**
         * Gets the value of the 'superPnr' field.
         * @return The value.
         */
        public java.lang.CharSequence getSuperPnr() {
            return superPnr;
        }

        /**
         * Sets the value of the 'superPnr' field.
         * @param value The value of 'superPnr'.
         * @return This builder.
         */
        public PaymentStatusDTO.Builder setSuperPnr(java.lang.CharSequence value) {
            validate(fields()[0], value);
            this.superPnr = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'superPnr' field has been set.
         * @return True if the 'superPnr' field has been set, false otherwise.
         */
        public boolean hasSuperPnr() {
            return fieldSetFlags()[0];
        }


        /**
         * Clears the value of the 'superPnr' field.
         * @return This builder.
         */
        public PaymentStatusDTO.Builder clearSuperPnr() {
            superPnr = null;
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'paymentId' field.
         * @return The value.
         */
        public java.lang.CharSequence getPaymentId() {
            return paymentId;
        }

        /**
         * Sets the value of the 'paymentId' field.
         * @param value The value of 'paymentId'.
         * @return This builder.
         */
        public PaymentStatusDTO.Builder setPaymentId(java.lang.CharSequence value) {
            validate(fields()[1], value);
            this.paymentId = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'paymentId' field has been set.
         * @return True if the 'paymentId' field has been set, false otherwise.
         */
        public boolean hasPaymentId() {
            return fieldSetFlags()[1];
        }


        /**
         * Clears the value of the 'paymentId' field.
         * @return This builder.
         */
        public PaymentStatusDTO.Builder clearPaymentId() {
            paymentId = null;
            fieldSetFlags()[1] = false;
            return this;
        }

        /**
         * Gets the value of the 'status' field.
         * @return The value.
         */
        public java.lang.CharSequence getStatus() {
            return status;
        }

        /**
         * Sets the value of the 'status' field.
         * @param value The value of 'status'.
         * @return This builder.
         */
        public PaymentStatusDTO.Builder setStatus(java.lang.CharSequence value) {
            validate(fields()[2], value);
            this.status = value;
            fieldSetFlags()[2] = true;
            return this;
        }

        /**
         * Checks whether the 'status' field has been set.
         * @return True if the 'status' field has been set, false otherwise.
         */
        public boolean hasStatus() {
            return fieldSetFlags()[2];
        }


        /**
         * Clears the value of the 'status' field.
         * @return This builder.
         */
        public PaymentStatusDTO.Builder clearStatus() {
            status = null;
            fieldSetFlags()[2] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public PaymentStatusDTO build() {
            try {
                PaymentStatusDTO record = new PaymentStatusDTO();
                record.superPnr = fieldSetFlags()[0] ? this.superPnr : (java.lang.CharSequence) defaultValue(fields()[0]);
                record.paymentId = fieldSetFlags()[1] ? this.paymentId : (java.lang.CharSequence) defaultValue(fields()[1]);
                record.status = fieldSetFlags()[2] ? this.status : (java.lang.CharSequence) defaultValue(fields()[2]);
                return record;
            } catch (java.lang.Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<PaymentStatusDTO>
            WRITER$ = (org.apache.avro.io.DatumWriter<PaymentStatusDTO>) MODEL$.createDatumWriter(SCHEMA$);

    @Override
    public void writeExternal(java.io.ObjectOutput out)
            throws java.io.IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<PaymentStatusDTO>
            READER$ = (org.apache.avro.io.DatumReader<PaymentStatusDTO>) MODEL$.createDatumReader(SCHEMA$);

    @Override
    public void readExternal(java.io.ObjectInput in)
            throws java.io.IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }

}
