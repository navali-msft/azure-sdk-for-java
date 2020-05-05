/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2020_03_01.PrivateEndpoints;
import com.microsoft.azure.management.network.v2020_03_01.PrivateEndpoint;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class PrivateEndpointsImpl extends GroupableResourcesCoreImpl<PrivateEndpoint, PrivateEndpointImpl, PrivateEndpointInner, PrivateEndpointsInner, NetworkManager>  implements PrivateEndpoints {
    protected PrivateEndpointsImpl(NetworkManager manager) {
        super(manager.inner().privateEndpoints(), manager);
    }

    @Override
    protected Observable<PrivateEndpointInner> getInnerAsync(String resourceGroupName, String name) {
        PrivateEndpointsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        PrivateEndpointsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<PrivateEndpoint> listByResourceGroup(String resourceGroupName) {
        PrivateEndpointsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<PrivateEndpoint> listByResourceGroupAsync(String resourceGroupName) {
        PrivateEndpointsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<PrivateEndpointInner>, Iterable<PrivateEndpointInner>>() {
            @Override
            public Iterable<PrivateEndpointInner> call(Page<PrivateEndpointInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PrivateEndpointInner, PrivateEndpoint>() {
            @Override
            public PrivateEndpoint call(PrivateEndpointInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<PrivateEndpoint> list() {
        PrivateEndpointsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<PrivateEndpoint> listAsync() {
        PrivateEndpointsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<PrivateEndpointInner>, Iterable<PrivateEndpointInner>>() {
            @Override
            public Iterable<PrivateEndpointInner> call(Page<PrivateEndpointInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PrivateEndpointInner, PrivateEndpoint>() {
            @Override
            public PrivateEndpoint call(PrivateEndpointInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PrivateEndpointImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected PrivateEndpointImpl wrapModel(PrivateEndpointInner inner) {
        return  new PrivateEndpointImpl(inner.name(), inner, manager());
    }

    @Override
    protected PrivateEndpointImpl wrapModel(String name) {
        return new PrivateEndpointImpl(name, new PrivateEndpointInner(), this.manager());
    }

}
