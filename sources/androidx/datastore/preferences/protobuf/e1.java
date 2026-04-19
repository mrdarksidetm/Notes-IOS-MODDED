package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class e1 {

    static class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f3554a;

        a(g gVar) {
            this.f3554a = gVar;
        }

        @Override // androidx.datastore.preferences.protobuf.e1.b
        public byte a(int i10) {
            return this.f3554a.b(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.e1.b
        public int size() {
            return this.f3554a.size();
        }
    }

    private interface b {
        byte a(int i10);

        int size();
    }

    static String a(g gVar) {
        return b(new a(gVar));
    }

    static String b(b bVar) {
        String str;
        StringBuilder sb2 = new StringBuilder(bVar.size());
        for (int i10 = 0; i10 < bVar.size(); i10++) {
            int iA = bVar.a(i10);
            if (iA == 34) {
                str = "\\\"";
            } else if (iA == 39) {
                str = "\\'";
            } else if (iA != 92) {
                switch (iA) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (iA < 32 || iA > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((iA >>> 6) & 3) + 48));
                            sb2.append((char) (((iA >>> 3) & 7) + 48));
                            iA = (iA & 7) + 48;
                        }
                        sb2.append((char) iA);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    static String c(String str) {
        return a(g.n(str));
    }
}
