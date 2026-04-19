package io.objectbox.converter;

/* JADX INFO: loaded from: classes2.dex */
public interface PropertyConverter<P, D> {
    D convertToDatabaseValue(P p10);

    P convertToEntityProperty(D d10);
}
