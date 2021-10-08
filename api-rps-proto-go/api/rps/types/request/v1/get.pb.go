// Code generated by protoc-gen-gogo. DO NOT EDIT.
// source: rps/types/request/v1/get.proto

package requestv1

import (
	fmt "fmt"
	proto "github.com/gogo/protobuf/proto"
	io "io"
	math "math"
	math_bits "math/bits"
	reflect "reflect"
	strings "strings"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.GoGoProtoPackageIsVersion3 // please upgrade the proto package

// Generic get params inplemented by all CRUD style get methods.
type Get struct {
	// List of fields to populate from the resource in the result.
	// // Defaults to empty, If empty all fields will be populated.
	// ID is always populated
	FieldMask []string `protobuf:"bytes,1,rep,name=field_mask,json=fieldMask,proto3" json:"field_mask,omitempty"`
}

func (m *Get) Reset()      { *m = Get{} }
func (*Get) ProtoMessage() {}
func (*Get) Descriptor() ([]byte, []int) {
	return fileDescriptor_e42a73ff5157ddd3, []int{0}
}
func (m *Get) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *Get) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_Get.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *Get) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Get.Merge(m, src)
}
func (m *Get) XXX_Size() int {
	return m.Size()
}
func (m *Get) XXX_DiscardUnknown() {
	xxx_messageInfo_Get.DiscardUnknown(m)
}

var xxx_messageInfo_Get proto.InternalMessageInfo

func (m *Get) GetFieldMask() []string {
	if m != nil {
		return m.FieldMask
	}
	return nil
}

func init() {
	proto.RegisterType((*Get)(nil), "rps.types.request.v1.Get")
}

func init() { proto.RegisterFile("rps/types/request/v1/get.proto", fileDescriptor_e42a73ff5157ddd3) }

var fileDescriptor_e42a73ff5157ddd3 = []byte{
	// 270 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0x92, 0x2b, 0x2a, 0x28, 0xd6,
	0x2f, 0xa9, 0x2c, 0x48, 0x2d, 0xd6, 0x2f, 0x4a, 0x2d, 0x2c, 0x4d, 0x2d, 0x2e, 0xd1, 0x2f, 0x33,
	0xd4, 0x4f, 0x4f, 0x2d, 0xd1, 0x2b, 0x28, 0xca, 0x2f, 0xc9, 0x17, 0x12, 0x29, 0x2a, 0x28, 0xd6,
	0x03, 0xcb, 0xeb, 0x41, 0xe5, 0xf5, 0xca, 0x0c, 0x95, 0x54, 0xb8, 0x98, 0xdd, 0x53, 0x4b, 0x84,
	0x64, 0xb9, 0xb8, 0xd2, 0x32, 0x53, 0x73, 0x52, 0xe2, 0x73, 0x13, 0x8b, 0xb3, 0x25, 0x18, 0x15,
	0x98, 0x35, 0x38, 0x83, 0x38, 0xc1, 0x22, 0xbe, 0x89, 0xc5, 0xd9, 0x4e, 0x0f, 0x18, 0x2f, 0x3c,
	0x94, 0x63, 0xb8, 0xf1, 0x50, 0x8e, 0xe1, 0xc3, 0x43, 0x39, 0xc6, 0x86, 0x47, 0x72, 0x8c, 0x2b,
	0x1e, 0xc9, 0x31, 0x9e, 0x78, 0x24, 0xc7, 0x78, 0xe1, 0x91, 0x1c, 0xe3, 0x83, 0x47, 0x72, 0x8c,
	0x2f, 0x1e, 0xc9, 0x31, 0x7c, 0x78, 0x24, 0xc7, 0x38, 0xe1, 0xb1, 0x1c, 0xc3, 0x85, 0xc7, 0x72,
	0x0c, 0x37, 0x1e, 0xcb, 0x31, 0x70, 0x49, 0x24, 0xe7, 0xe7, 0xea, 0x61, 0xb3, 0xd6, 0x89, 0xc3,
	0x3d, 0xb5, 0x24, 0x00, 0xe4, 0xac, 0x00, 0xc6, 0xa8, 0x80, 0xf4, 0xcc, 0x92, 0x8c, 0xd2, 0x24,
	0xbd, 0xc4, 0xaa, 0x64, 0xbd, 0xd4, 0x8a, 0x12, 0xbd, 0x8c, 0x02, 0xbd, 0xe4, 0xfc, 0x5c, 0xfd,
	0x8c, 0x02, 0x5d, 0x90, 0x8f, 0x12, 0x0b, 0x32, 0x41, 0xb4, 0x2e, 0xd8, 0x13, 0xba, 0xe9, 0xf9,
	0x20, 0x01, 0x7d, 0x6c, 0x5e, 0xb5, 0x86, 0x32, 0xcb, 0x0c, 0x17, 0x31, 0x31, 0x07, 0x85, 0x04,
	0xad, 0x62, 0x12, 0x09, 0x2a, 0x28, 0xd6, 0x0b, 0x01, 0x5b, 0x1d, 0x04, 0xb5, 0x3a, 0xcc, 0xf0,
	0x14, 0x58, 0x38, 0x06, 0x2c, 0x1c, 0x03, 0x15, 0x8e, 0x09, 0x33, 0x4c, 0x62, 0x03, 0x5b, 0x60,
	0x0c, 0x08, 0x00, 0x00, 0xff, 0xff, 0x6d, 0x75, 0x14, 0xad, 0x47, 0x01, 0x00, 0x00,
}

func (this *Get) Equal(that interface{}) bool {
	if that == nil {
		return this == nil
	}

	that1, ok := that.(*Get)
	if !ok {
		that2, ok := that.(Get)
		if ok {
			that1 = &that2
		} else {
			return false
		}
	}
	if that1 == nil {
		return this == nil
	} else if this == nil {
		return false
	}
	if len(this.FieldMask) != len(that1.FieldMask) {
		return false
	}
	for i := range this.FieldMask {
		if this.FieldMask[i] != that1.FieldMask[i] {
			return false
		}
	}
	return true
}
func (this *Get) GoString() string {
	if this == nil {
		return "nil"
	}
	s := make([]string, 0, 5)
	s = append(s, "&requestv1.Get{")
	s = append(s, "FieldMask: "+fmt.Sprintf("%#v", this.FieldMask)+",\n")
	s = append(s, "}")
	return strings.Join(s, "")
}
func valueToGoStringGet(v interface{}, typ string) string {
	rv := reflect.ValueOf(v)
	if rv.IsNil() {
		return "nil"
	}
	pv := reflect.Indirect(rv).Interface()
	return fmt.Sprintf("func(v %v) *%v { return &v } ( %#v )", typ, typ, pv)
}
func (m *Get) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *Get) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *Get) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	if len(m.FieldMask) > 0 {
		for iNdEx := len(m.FieldMask) - 1; iNdEx >= 0; iNdEx-- {
			i -= len(m.FieldMask[iNdEx])
			copy(dAtA[i:], m.FieldMask[iNdEx])
			i = encodeVarintGet(dAtA, i, uint64(len(m.FieldMask[iNdEx])))
			i--
			dAtA[i] = 0xa
		}
	}
	return len(dAtA) - i, nil
}

func encodeVarintGet(dAtA []byte, offset int, v uint64) int {
	offset -= sovGet(v)
	base := offset
	for v >= 1<<7 {
		dAtA[offset] = uint8(v&0x7f | 0x80)
		v >>= 7
		offset++
	}
	dAtA[offset] = uint8(v)
	return base
}
func (m *Get) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	if len(m.FieldMask) > 0 {
		for _, s := range m.FieldMask {
			l = len(s)
			n += 1 + l + sovGet(uint64(l))
		}
	}
	return n
}

func sovGet(x uint64) (n int) {
	return (math_bits.Len64(x|1) + 6) / 7
}
func sozGet(x uint64) (n int) {
	return sovGet(uint64((x << 1) ^ uint64((int64(x) >> 63))))
}
func (this *Get) String() string {
	if this == nil {
		return "nil"
	}
	s := strings.Join([]string{`&Get{`,
		`FieldMask:` + fmt.Sprintf("%v", this.FieldMask) + `,`,
		`}`,
	}, "")
	return s
}
func valueToStringGet(v interface{}) string {
	rv := reflect.ValueOf(v)
	if rv.IsNil() {
		return "nil"
	}
	pv := reflect.Indirect(rv).Interface()
	return fmt.Sprintf("*%v", pv)
}
func (m *Get) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowGet
			}
			if iNdEx >= l {
				return io.ErrUnexpectedEOF
			}
			b := dAtA[iNdEx]
			iNdEx++
			wire |= uint64(b&0x7F) << shift
			if b < 0x80 {
				break
			}
		}
		fieldNum := int32(wire >> 3)
		wireType := int(wire & 0x7)
		if wireType == 4 {
			return fmt.Errorf("proto: Get: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: Get: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		case 1:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field FieldMask", wireType)
			}
			var stringLen uint64
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowGet
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				stringLen |= uint64(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
			intStringLen := int(stringLen)
			if intStringLen < 0 {
				return ErrInvalidLengthGet
			}
			postIndex := iNdEx + intStringLen
			if postIndex < 0 {
				return ErrInvalidLengthGet
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			m.FieldMask = append(m.FieldMask, string(dAtA[iNdEx:postIndex]))
			iNdEx = postIndex
		default:
			iNdEx = preIndex
			skippy, err := skipGet(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if (skippy < 0) || (iNdEx+skippy) < 0 {
				return ErrInvalidLengthGet
			}
			if (iNdEx + skippy) > l {
				return io.ErrUnexpectedEOF
			}
			iNdEx += skippy
		}
	}

	if iNdEx > l {
		return io.ErrUnexpectedEOF
	}
	return nil
}
func skipGet(dAtA []byte) (n int, err error) {
	l := len(dAtA)
	iNdEx := 0
	depth := 0
	for iNdEx < l {
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return 0, ErrIntOverflowGet
			}
			if iNdEx >= l {
				return 0, io.ErrUnexpectedEOF
			}
			b := dAtA[iNdEx]
			iNdEx++
			wire |= (uint64(b) & 0x7F) << shift
			if b < 0x80 {
				break
			}
		}
		wireType := int(wire & 0x7)
		switch wireType {
		case 0:
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return 0, ErrIntOverflowGet
				}
				if iNdEx >= l {
					return 0, io.ErrUnexpectedEOF
				}
				iNdEx++
				if dAtA[iNdEx-1] < 0x80 {
					break
				}
			}
		case 1:
			iNdEx += 8
		case 2:
			var length int
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return 0, ErrIntOverflowGet
				}
				if iNdEx >= l {
					return 0, io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				length |= (int(b) & 0x7F) << shift
				if b < 0x80 {
					break
				}
			}
			if length < 0 {
				return 0, ErrInvalidLengthGet
			}
			iNdEx += length
		case 3:
			depth++
		case 4:
			if depth == 0 {
				return 0, ErrUnexpectedEndOfGroupGet
			}
			depth--
		case 5:
			iNdEx += 4
		default:
			return 0, fmt.Errorf("proto: illegal wireType %d", wireType)
		}
		if iNdEx < 0 {
			return 0, ErrInvalidLengthGet
		}
		if depth == 0 {
			return iNdEx, nil
		}
	}
	return 0, io.ErrUnexpectedEOF
}

var (
	ErrInvalidLengthGet        = fmt.Errorf("proto: negative length found during unmarshaling")
	ErrIntOverflowGet          = fmt.Errorf("proto: integer overflow")
	ErrUnexpectedEndOfGroupGet = fmt.Errorf("proto: unexpected end of group")
)
