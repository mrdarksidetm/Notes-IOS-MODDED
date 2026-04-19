package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import da.c;
import java.util.Collections;
import java.util.List;
import pa.h;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FlutterFirebaseCoreRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        return Collections.singletonList(h.b("flutter-fire-core", "3.8.1"));
    }
}
