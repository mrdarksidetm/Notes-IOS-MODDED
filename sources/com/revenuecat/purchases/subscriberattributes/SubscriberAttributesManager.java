package com.revenuecat.purchases.subscriberattributes;

import ae.f0;
import ae.j;
import ae.r;
import ae.s;
import android.app.Application;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import je.v;
import md.i0;
import md.x;
import nd.c0;
import nd.q0;
import nd.r0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class SubscriberAttributesManager {
    private final SubscriberAttributesPoster backend;
    private final SubscriberAttributesCache deviceCache;
    private final DeviceIdentifiersFetcher deviceIdentifiersFetcher;
    private final ObtainDeviceIdentifiersObservable obtainingDeviceIdentifiersObservable;

    /* JADX INFO: Access modifiers changed from: private */
    static final class ObtainDeviceIdentifiersObservable extends Observable {
        private final ArrayList<zd.a<i0>> listeners = new ArrayList<>();
        private int numberOfProcesses;

        public ObtainDeviceIdentifiersObservable() {
            addObserver(new Observer() { // from class: com.revenuecat.purchases.subscriberattributes.a
                @Override // java.util.Observer
                public final void update(Observable observable, Object obj) {
                    SubscriberAttributesManager.ObtainDeviceIdentifiersObservable._init_$lambda$2(this.f9117a, observable, obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$2(ObtainDeviceIdentifiersObservable obtainDeviceIdentifiersObservable, Observable observable, Object obj) {
            r.f(obtainDeviceIdentifiersObservable, "this$0");
            r.d(observable, "null cannot be cast to non-null type com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager.ObtainDeviceIdentifiersObservable");
            if (((ObtainDeviceIdentifiersObservable) observable).numberOfProcesses == 0) {
                synchronized (obtainDeviceIdentifiersObservable) {
                    Iterator<T> it = obtainDeviceIdentifiersObservable.listeners.iterator();
                    while (it.hasNext()) {
                        ((zd.a) it.next()).invoke();
                    }
                    obtainDeviceIdentifiersObservable.listeners.clear();
                    i0 i0Var = i0.f15558a;
                }
            }
        }

        public final synchronized int getNumberOfProcesses() {
            return this.numberOfProcesses;
        }

        public final synchronized void setNumberOfProcesses(int i10) {
            if (this.numberOfProcesses == i10) {
                return;
            }
            this.numberOfProcesses = i10;
            setChanged();
            notifyObservers();
        }

        public final synchronized void waitUntilIdle(zd.a<i0> aVar) {
            r.f(aVar, "completion");
            if (this.numberOfProcesses == 0) {
                aVar.invoke();
            } else {
                this.listeners.add(new SubscriberAttributesManager$ObtainDeviceIdentifiersObservable$waitUntilIdle$1(aVar));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$collectDeviceIdentifiers$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<Map<String, ? extends String>, i0> {
        final /* synthetic */ String $appUserID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str) {
            super(1);
            this.$appUserID = str;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Map<String, ? extends String> map) {
            invoke2((Map<String, String>) map);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, String> map) {
            r.f(map, "deviceIdentifiers");
            SubscriberAttributesManager.this.setAttributes(map, this.$appUserID);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$getDeviceIdentifiers$1, reason: invalid class name and case insensitive filesystem */
    static final class C06111 extends s implements l<Map<String, ? extends String>, i0> {
        final /* synthetic */ l<Map<String, String>, i0> $completion;
        final /* synthetic */ SubscriberAttributesManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06111(l<? super Map<String, String>, i0> lVar, SubscriberAttributesManager subscriberAttributesManager) {
            super(1);
            this.$completion = lVar;
            this.this$0 = subscriberAttributesManager;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Map<String, ? extends String> map) {
            invoke2((Map<String, String>) map);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, String> map) {
            r.f(map, "deviceIdentifiers");
            this.$completion.invoke(map);
            this.this$0.obtainingDeviceIdentifiersObservable.setNumberOfProcesses(r2.getNumberOfProcesses() - 1);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$getUnsyncedSubscriberAttributes$1, reason: invalid class name and case insensitive filesystem */
    static final class C06121 extends s implements zd.a<i0> {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ l<Map<String, SubscriberAttribute>, i0> $completion;
        final /* synthetic */ SubscriberAttributesManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06121(l<? super Map<String, SubscriberAttribute>, i0> lVar, SubscriberAttributesManager subscriberAttributesManager, String str) {
            super(0);
            this.$completion = lVar;
            this.this$0 = subscriberAttributesManager;
            this.$appUserID = str;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$completion.invoke(this.this$0.getDeviceCache().getUnsyncedSubscriberAttributes(this.$appUserID));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$setAttributionID$1, reason: invalid class name and case insensitive filesystem */
    static final class C06131 extends s implements l<Map<String, ? extends String>, i0> {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ SubscriberAttributeKey.AttributionIds $attributionKey;
        final /* synthetic */ String $value;
        final /* synthetic */ SubscriberAttributesManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06131(SubscriberAttributeKey.AttributionIds attributionIds, String str, SubscriberAttributesManager subscriberAttributesManager, String str2) {
            super(1);
            this.$attributionKey = attributionIds;
            this.$value = str;
            this.this$0 = subscriberAttributesManager;
            this.$appUserID = str2;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Map<String, ? extends String> map) {
            invoke2((Map<String, String>) map);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, String> map) {
            r.f(map, "deviceIdentifiers");
            this.this$0.setAttributes(r0.l(q0.c(x.a(this.$attributionKey.getBackendKey(), this.$value)), map), this.$appUserID);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1, reason: invalid class name and case insensitive filesystem */
    static final class C06141 extends s implements zd.a<i0> {
        final /* synthetic */ zd.a<i0> $completion;
        final /* synthetic */ String $currentAppUserID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06141(zd.a<i0> aVar, String str) {
            super(0);
            this.$completion = aVar;
            this.$currentAppUserID = str;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Map<String, Map<String, SubscriberAttribute>> unsyncedSubscriberAttributes = SubscriberAttributesManager.this.getDeviceCache().getUnsyncedSubscriberAttributes();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Map<String, SubscriberAttribute>> entry : unsyncedSubscriberAttributes.entrySet()) {
                if (!v.v(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (linkedHashMap.isEmpty()) {
                LogWrapperKt.log(LogIntent.DEBUG, AttributionStrings.NO_SUBSCRIBER_ATTRIBUTES_TO_SYNCHRONIZE);
                zd.a<i0> aVar = this.$completion;
                if (aVar != null) {
                    aVar.invoke();
                    return;
                }
                return;
            }
            int size = linkedHashMap.size();
            f0 f0Var = new f0();
            SubscriberAttributesManager subscriberAttributesManager = SubscriberAttributesManager.this;
            String str = this.$currentAppUserID;
            zd.a<i0> aVar2 = this.$completion;
            for (Iterator it = linkedHashMap.entrySet().iterator(); it.hasNext(); it = it) {
                Map.Entry entry2 = (Map.Entry) it.next();
                String str2 = (String) entry2.getKey();
                Map map = (Map) entry2.getValue();
                subscriberAttributesManager.getBackend().postSubscriberAttributes(BackendHelpersKt.toBackendMap(map), str2, new SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$1(subscriberAttributesManager, str2, map, str, f0Var, aVar2, size), new SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$2(subscriberAttributesManager, str2, map, f0Var, aVar2, size));
                str = str;
            }
        }
    }

    public SubscriberAttributesManager(SubscriberAttributesCache subscriberAttributesCache, SubscriberAttributesPoster subscriberAttributesPoster, DeviceIdentifiersFetcher deviceIdentifiersFetcher) {
        r.f(subscriberAttributesCache, "deviceCache");
        r.f(subscriberAttributesPoster, "backend");
        r.f(deviceIdentifiersFetcher, "deviceIdentifiersFetcher");
        this.deviceCache = subscriberAttributesCache;
        this.backend = subscriberAttributesPoster;
        this.deviceIdentifiersFetcher = deviceIdentifiersFetcher;
        this.obtainingDeviceIdentifiersObservable = new ObtainDeviceIdentifiersObservable();
    }

    private final void getDeviceIdentifiers(Application application, l<? super Map<String, String>, i0> lVar) {
        ObtainDeviceIdentifiersObservable obtainDeviceIdentifiersObservable = this.obtainingDeviceIdentifiersObservable;
        obtainDeviceIdentifiersObservable.setNumberOfProcesses(obtainDeviceIdentifiersObservable.getNumberOfProcesses() + 1);
        this.deviceIdentifiersFetcher.getDeviceIdentifiers(application, new C06111(lVar, this));
    }

    private final void storeAttributesIfNeeded(Map<String, SubscriberAttribute> map, String str) {
        Map<String, SubscriberAttribute> allStoredSubscriberAttributes = this.deviceCache.getAllStoredSubscriberAttributes(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, SubscriberAttribute>> it = map.entrySet().iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, SubscriberAttribute> next = it.next();
            String key = next.getKey();
            SubscriberAttribute value = next.getValue();
            if (allStoredSubscriberAttributes.containsKey(key)) {
                SubscriberAttribute subscriberAttribute = allStoredSubscriberAttributes.get(key);
                if (r.b(subscriberAttribute != null ? subscriberAttribute.getValue() : null, value.getValue())) {
                    z10 = false;
                }
            }
            if (z10) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        if (!linkedHashMap.isEmpty()) {
            this.deviceCache.setAttributes(str, linkedHashMap);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void synchronizeSubscriberAttributesForAllUsers$default(SubscriberAttributesManager subscriberAttributesManager, String str, zd.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(str, aVar);
    }

    public final void collectDeviceIdentifiers(String str, Application application) {
        r.f(str, "appUserID");
        r.f(application, "applicationContext");
        getDeviceIdentifiers(application, new AnonymousClass1(str));
    }

    public final synchronized void copyUnsyncedSubscriberAttributes(String str, String str2) {
        r.f(str, "originalAppUserId");
        r.f(str2, "newAppUserID");
        Map<String, SubscriberAttribute> unsyncedSubscriberAttributes = this.deviceCache.getUnsyncedSubscriberAttributes(str);
        if (unsyncedSubscriberAttributes.isEmpty()) {
            return;
        }
        String str3 = String.format(AttributionStrings.COPYING_ATTRIBUTES_FROM_TO_USER, Arrays.copyOf(new Object[]{str, str2}, 2));
        r.e(str3, "format(this, *args)");
        LogUtilsKt.infoLog(str3);
        this.deviceCache.setAttributes(str2, unsyncedSubscriberAttributes);
        this.deviceCache.clearAllSubscriberAttributesFromUser(str);
    }

    public final SubscriberAttributesPoster getBackend() {
        return this.backend;
    }

    public final SubscriberAttributesCache getDeviceCache() {
        return this.deviceCache;
    }

    public final synchronized void getUnsyncedSubscriberAttributes(String str, l<? super Map<String, SubscriberAttribute>, i0> lVar) {
        r.f(str, "appUserID");
        r.f(lVar, "completion");
        this.obtainingDeviceIdentifiersObservable.waitUntilIdle(new C06121(lVar, this, str));
    }

    public final synchronized void markAsSynced(String str, Map<String, SubscriberAttribute> map, List<SubscriberAttributeError> list) {
        r.f(str, "appUserID");
        r.f(map, "attributesToMarkAsSynced");
        r.f(list, "attributeErrors");
        if (!list.isEmpty()) {
            LogIntent logIntent = LogIntent.RC_ERROR;
            String str2 = String.format(AttributionStrings.SUBSCRIBER_ATTRIBUTES_ERROR, Arrays.copyOf(new Object[]{list}, 1));
            r.e(str2, "format(this, *args)");
            LogWrapperKt.log(logIntent, str2);
        }
        if (map.isEmpty()) {
            return;
        }
        LogIntent logIntent2 = LogIntent.INFO;
        StringBuilder sb2 = new StringBuilder();
        String str3 = String.format(AttributionStrings.MARKING_ATTRIBUTES_SYNCED, Arrays.copyOf(new Object[]{str}, 1));
        r.e(str3, "format(this, *args)");
        sb2.append(str3);
        sb2.append(c0.h0(map.values(), "\n", null, null, 0, null, null, 62, null));
        LogWrapperKt.log(logIntent2, sb2.toString());
        Map<String, SubscriberAttribute> allStoredSubscriberAttributes = this.deviceCache.getAllStoredSubscriberAttributes(str);
        Map<String, SubscriberAttribute> mapV = r0.v(allStoredSubscriberAttributes);
        for (Map.Entry<String, SubscriberAttribute> entry : map.entrySet()) {
            String key = entry.getKey();
            SubscriberAttribute value = entry.getValue();
            SubscriberAttribute subscriberAttribute = allStoredSubscriberAttributes.get(key);
            if (subscriberAttribute != null) {
                if (subscriberAttribute.isSynced()) {
                    subscriberAttribute = null;
                }
                if (subscriberAttribute != null) {
                    if ((r.b(subscriberAttribute.getValue(), value.getValue()) ? subscriberAttribute : null) != null) {
                        mapV.put(key, SubscriberAttribute.copy$default(value, null, null, null, null, true, 15, null));
                    }
                }
            }
        }
        this.deviceCache.setAttributes(str, mapV);
    }

    public final synchronized void setAttribute(SubscriberAttributeKey subscriberAttributeKey, String str, String str2) {
        r.f(subscriberAttributeKey, SubscriberAttributeKt.JSON_NAME_KEY);
        r.f(str2, "appUserID");
        setAttributes(q0.c(x.a(subscriberAttributeKey.getBackendKey(), str)), str2);
    }

    public final synchronized void setAttributes(Map<String, String> map, String str) {
        r.f(map, "attributesToSet");
        r.f(str, "appUserID");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            arrayList.add(x.a(key, new SubscriberAttribute(key, entry.getValue(), (DateProvider) null, (Date) null, false, 28, (j) null)));
        }
        storeAttributesIfNeeded(r0.r(arrayList), str);
    }

    public final void setAttributionID(SubscriberAttributeKey.AttributionIds attributionIds, String str, String str2, Application application) {
        r.f(attributionIds, "attributionKey");
        r.f(str2, "appUserID");
        r.f(application, "applicationContext");
        getDeviceIdentifiers(application, new C06131(attributionIds, str, this, str2));
    }

    public final void synchronizeSubscriberAttributesForAllUsers(String str, zd.a<i0> aVar) {
        r.f(str, "currentAppUserID");
        this.obtainingDeviceIdentifiersObservable.waitUntilIdle(new C06141(aVar, str));
    }
}
