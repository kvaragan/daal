/* file: LcnMethod.java */
/*******************************************************************************
* Copyright 2014-2017 Intel Corporation
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*******************************************************************************/

/**
 * @ingroup lcn_layers
 * @{
 */
package com.intel.daal.algorithms.neural_networks.layers.lcn;

/**
 * <a name="DAAL-CLASS-ALGORITHMS__NEURAL_NETWORKS__LAYERS__LCN__LCNMETHOD"></a>
 * @brief Available methods for the local contrast normalization layer
 */
public final class LcnMethod {
    /** @private */
    static {
        System.loadLibrary("JavaAPI");
    }

    private int _value;

    /**
     * Constructs the method object using the provided value
     * @param value     Value corresponding to the method object
     */
    public LcnMethod(int value) {
        _value = value;
    }

    /**
     * Returns the value corresponding to the method object
     * @return Value corresponding to the method object
     */
    public int getValue() {
        return _value;
    }

    private static final int DefaultMethodValue = 0;

    public static final LcnMethod defaultDense = new LcnMethod(DefaultMethodValue); /*!< Default method */
}
/** @} */
