/*
 *  Copyright (c) 2022, WSO2 LLC. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package v1alpha1

import (
	metav1 "k8s.io/apimachinery/pkg/apis/meta/v1"
	gwapiv1b1 "sigs.k8s.io/gateway-api/apis/v1alpha2"
)

// EDIT THIS FILE!  THIS IS SCAFFOLDING FOR YOU TO OWN!
// NOTE: json tags are required.  Any new fields you add must have json tags for the fields to be serialized.

// APIPolicySpec defines the desired state of APIPolicy
type APIPolicySpec struct {
	// RequestQueryModifier support request query modifications
	//
	//
	// +optional
	RequestQueryModifier RequestQueryModifier            `json:"requestQueryModifier,omitempty"`
	TargetRef            gwapiv1b1.PolicyTargetReference `json:"targetRef,omitempty"`
}

// RequestQueryModifier allows to modify request query params
type RequestQueryModifier struct {
	Add       string `json:"add,omitempty"`
	Remove    string `json:"remove,omitempty"`
	RemoveAll string `json:"removeAll,omitempty"`
}

// APIPolicyStatus defines the observed state of APIPolicy
type APIPolicyStatus struct {
	// INSERT ADDITIONAL STATUS FIELD - define observed state of cluster
	// Important: Run "make" to regenerate code after modifying this file
}

//+kubebuilder:object:root=true
//+kubebuilder:subresource:status

// APIPolicy is the Schema for the apipolicies API
type APIPolicy struct {
	metav1.TypeMeta   `json:",inline"`
	metav1.ObjectMeta `json:"metadata,omitempty"`

	Spec   APIPolicySpec   `json:"spec,omitempty"`
	Status APIPolicyStatus `json:"status,omitempty"`
}

//+kubebuilder:object:root=true

// APIPolicyList contains a list of APIPolicy
type APIPolicyList struct {
	metav1.TypeMeta `json:",inline"`
	metav1.ListMeta `json:"metadata,omitempty"`
	Items           []APIPolicy `json:"items"`
}

func init() {
	SchemeBuilder.Register(&APIPolicy{}, &APIPolicyList{})
}