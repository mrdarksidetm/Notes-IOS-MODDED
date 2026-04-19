package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.j;
import ae.r;

/* JADX INFO: loaded from: classes2.dex */
abstract class ImageSource {

    public static final class Local extends ImageSource {
        public static final int $stable = 8;
        private final Object data;
        private final int resource;

        public Local(int i10) {
            super(null);
            this.resource = i10;
            this.data = Integer.valueOf(i10);
        }

        public static /* synthetic */ Local copy$default(Local local, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = local.resource;
            }
            return local.copy(i10);
        }

        public final int component1() {
            return this.resource;
        }

        public final Local copy(int i10) {
            return new Local(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Local) && this.resource == ((Local) obj).resource;
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.composables.ImageSource
        public Object getData() {
            return this.data;
        }

        public final int getResource() {
            return this.resource;
        }

        public int hashCode() {
            return Integer.hashCode(this.resource);
        }

        public String toString() {
            return "Local(resource=" + this.resource + ')';
        }
    }

    public static final class Remote extends ImageSource {
        public static final int $stable = 8;
        private final Object data;
        private final String urlString;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Remote(String str) {
            super(null);
            r.f(str, "urlString");
            this.urlString = str;
            this.data = str;
        }

        public static /* synthetic */ Remote copy$default(Remote remote, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = remote.urlString;
            }
            return remote.copy(str);
        }

        public final String component1() {
            return this.urlString;
        }

        public final Remote copy(String str) {
            r.f(str, "urlString");
            return new Remote(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Remote) && r.b(this.urlString, ((Remote) obj).urlString);
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.composables.ImageSource
        public Object getData() {
            return this.data;
        }

        public final String getUrlString() {
            return this.urlString;
        }

        public int hashCode() {
            return this.urlString.hashCode();
        }

        public String toString() {
            return "Remote(urlString=" + this.urlString + ')';
        }
    }

    private ImageSource() {
    }

    public /* synthetic */ ImageSource(j jVar) {
        this();
    }

    public abstract Object getData();
}
