package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import da.c;
import java.util.List;
import nd.t;
import pa.h;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        return t.d(h.b("fire-core-ktx", "21.0.0"));
    }
}
