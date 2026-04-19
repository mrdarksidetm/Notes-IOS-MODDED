package c4;

import ae.j;
import ae.r;
import androidx.datastore.preferences.protobuf.z;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6386a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public final f a(InputStream inputStream) throws a4.a {
            r.f(inputStream, "input");
            try {
                f fVarR = f.R(inputStream);
                r.e(fVarR, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return fVarR;
            } catch (z e10) {
                throw new a4.a("Unable to parse preferences proto.", e10);
            }
        }
    }
}
