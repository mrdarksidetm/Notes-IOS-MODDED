package io.objectbox.converter;

import id.b;

/* JADX INFO: loaded from: classes2.dex */
public class LongLongMapConverter extends LongFlexMapConverter {
    @Override // io.objectbox.converter.FlexObjectConverter
    protected boolean shouldRestoreAsLong(b.g gVar) {
        return true;
    }
}
