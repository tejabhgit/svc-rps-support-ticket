// Code generated by protoc-gen-gogo. DO NOT EDIT.
// source: rps/types/request/v1/list.proto

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

// Generic list params inplemented by all CRUD style list methods.
type List struct {
	// A document that defines the sort order of the result set.
	// Items are by default retuned in the stored order,
	// but it is not guaranteed to be that they are in the inserted order.
	// They are not sorted by the _id field. Sometimes it can be look like it is
	// sorted by the insertion order but it can change in another request. It is not reliable.
	Order string `protobuf:"bytes,1,opt,name=order,proto3" json:"order,omitempty"`
	// Maximum number of items to return.
	// Defaults to 50, Maximum allowed is 50
	ItemLimit int64 `protobuf:"varint,2,opt,name=item_limit,json=itemLimit,proto3" json:"item_limit,omitempty"`
	// Page offset.
	// Defaults to 0
	PageOffset int64 `protobuf:"varint,3,opt,name=page_offset,json=pageOffset,proto3" json:"page_offset,omitempty"`
	// List of fields to populate from the resource in the result.
	// If empty all fields will be populated.
	// ID is always populated
	FieldMask []string `protobuf:"bytes,4,rep,name=field_mask,json=fieldMask,proto3" json:"field_mask,omitempty"`
}

func (m *List) Reset()      { *m = List{} }
func (*List) ProtoMessage() {}
func (*List) Descriptor() ([]byte, []int) {
	return fileDescriptor_75ca427c57dd95d0, []int{0}
}
func (m *List) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *List) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_List.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *List) XXX_Merge(src proto.Message) {
	xxx_messageInfo_List.Merge(m, src)
}
func (m *List) XXX_Size() int {
	return m.Size()
}
func (m *List) XXX_DiscardUnknown() {
	xxx_messageInfo_List.DiscardUnknown(m)
}

var xxx_messageInfo_List proto.InternalMessageInfo

func (m *List) GetOrder() string {
	if m != nil {
		return m.Order
	}
	return ""
}

func (m *List) GetItemLimit() int64 {
	if m != nil {
		return m.ItemLimit
	}
	return 0
}

func (m *List) GetPageOffset() int64 {
	if m != nil {
		return m.PageOffset
	}
	return 0
}

func (m *List) GetFieldMask() []string {
	if m != nil {
		return m.FieldMask
	}
	return nil
}

func init() {
	proto.RegisterType((*List)(nil), "rps.types.request.v1.List")
}

func init() { proto.RegisterFile("rps/types/request/v1/list.proto", fileDescriptor_75ca427c57dd95d0) }

var fileDescriptor_75ca427c57dd95d0 = []byte{
	// 326 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x6c, 0x90, 0xbd, 0x6e, 0xc2, 0x30,
	0x14, 0x85, 0x63, 0x42, 0x2b, 0xc5, 0xdd, 0x22, 0x86, 0x2c, 0xbd, 0xa0, 0x4e, 0x2c, 0x38, 0x8a,
	0x3a, 0x76, 0x63, 0xa6, 0x2a, 0xb2, 0x10, 0x43, 0x85, 0x84, 0x02, 0x18, 0xb0, 0x20, 0xb2, 0x6b,
	0x1b, 0xd4, 0x9f, 0xa5, 0x8f, 0xd0, 0x67, 0xe8, 0x54, 0xf5, 0x49, 0xaa, 0x4e, 0x8c, 0x8c, 0x8d,
	0x59, 0x3a, 0xf2, 0x08, 0x95, 0xdd, 0x8c, 0x4c, 0xf6, 0xfd, 0xee, 0xb9, 0x3a, 0x3a, 0x07, 0x37,
	0x95, 0xd4, 0xa9, 0x79, 0x92, 0x4c, 0xa7, 0x8a, 0x3d, 0x6c, 0x98, 0x36, 0xe9, 0x36, 0x4b, 0xd7,
	0x5c, 0x1b, 0x22, 0x95, 0x30, 0x22, 0x6e, 0x28, 0xa9, 0x89, 0x17, 0x90, 0x4a, 0x40, 0xb6, 0xd9,
	0xd5, 0x0b, 0xae, 0xf7, 0xb8, 0x36, 0x71, 0x03, 0x9f, 0x09, 0x35, 0x63, 0x2a, 0x41, 0x2d, 0xd4,
	0x8e, 0xe8, 0xff, 0x10, 0x5f, 0x62, 0xcc, 0x0d, 0x2b, 0xc6, 0x6b, 0x5e, 0x70, 0x93, 0xd4, 0x5a,
	0xa8, 0x1d, 0xd2, 0xc8, 0x91, 0x9e, 0x03, 0x71, 0x13, 0x5f, 0xc8, 0x7c, 0xc1, 0xc6, 0x62, 0x3e,
	0xd7, 0xcc, 0x24, 0xa1, 0xdf, 0x63, 0x87, 0xee, 0x3c, 0x71, 0xf7, 0x73, 0xce, 0xd6, 0xb3, 0x71,
	0x91, 0xeb, 0x55, 0x52, 0x6f, 0x85, 0xed, 0x88, 0x46, 0x9e, 0xdc, 0xe6, 0x7a, 0xd5, 0x2d, 0xd1,
	0xae, 0x84, 0x60, 0x5f, 0x42, 0x70, 0x2c, 0x01, 0xbd, 0x5a, 0x40, 0x1f, 0x16, 0xd0, 0x97, 0x05,
	0xb4, 0xb3, 0x80, 0x7e, 0x2c, 0xa0, 0x5f, 0x0b, 0xc1, 0xd1, 0x02, 0x7a, 0x3b, 0x40, 0xb0, 0x3b,
	0x40, 0xb0, 0x3f, 0x40, 0x80, 0x93, 0xa9, 0x28, 0xc8, 0xa9, 0x34, 0xdd, 0xc8, 0x65, 0xe9, 0xbb,
	0xb8, 0x7d, 0x74, 0xdf, 0x5f, 0x70, 0xb3, 0xdc, 0x4c, 0x48, 0xfe, 0x3c, 0x25, 0xec, 0xd1, 0x90,
	0xa5, 0x24, 0x53, 0x51, 0xa4, 0x4b, 0xd9, 0x71, 0x55, 0xe5, 0x92, 0xbb, 0xb7, 0xe3, 0xcb, 0xe9,
	0x2c, 0x84, 0x03, 0xe9, 0xa9, 0x0e, 0x6f, 0xaa, 0xef, 0x36, 0x7b, 0xaf, 0x85, 0x74, 0x40, 0x3f,
	0x6b, 0x0d, 0x2a, 0x35, 0x19, 0x78, 0x6f, 0x5a, 0x79, 0x0f, 0xb3, 0x6f, 0x8f, 0x47, 0x1e, 0x8f,
	0x2a, 0x3c, 0x1a, 0x66, 0x93, 0x73, 0x6f, 0x70, 0xfd, 0x17, 0x00, 0x00, 0xff, 0xff, 0x37, 0x5b,
	0x49, 0x94, 0xa0, 0x01, 0x00, 0x00,
}

func (this *List) Equal(that interface{}) bool {
	if that == nil {
		return this == nil
	}

	that1, ok := that.(*List)
	if !ok {
		that2, ok := that.(List)
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
	if this.Order != that1.Order {
		return false
	}
	if this.ItemLimit != that1.ItemLimit {
		return false
	}
	if this.PageOffset != that1.PageOffset {
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
func (this *List) GoString() string {
	if this == nil {
		return "nil"
	}
	s := make([]string, 0, 8)
	s = append(s, "&requestv1.List{")
	s = append(s, "Order: "+fmt.Sprintf("%#v", this.Order)+",\n")
	s = append(s, "ItemLimit: "+fmt.Sprintf("%#v", this.ItemLimit)+",\n")
	s = append(s, "PageOffset: "+fmt.Sprintf("%#v", this.PageOffset)+",\n")
	s = append(s, "FieldMask: "+fmt.Sprintf("%#v", this.FieldMask)+",\n")
	s = append(s, "}")
	return strings.Join(s, "")
}
func valueToGoStringList(v interface{}, typ string) string {
	rv := reflect.ValueOf(v)
	if rv.IsNil() {
		return "nil"
	}
	pv := reflect.Indirect(rv).Interface()
	return fmt.Sprintf("func(v %v) *%v { return &v } ( %#v )", typ, typ, pv)
}
func (m *List) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *List) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *List) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	if len(m.FieldMask) > 0 {
		for iNdEx := len(m.FieldMask) - 1; iNdEx >= 0; iNdEx-- {
			i -= len(m.FieldMask[iNdEx])
			copy(dAtA[i:], m.FieldMask[iNdEx])
			i = encodeVarintList(dAtA, i, uint64(len(m.FieldMask[iNdEx])))
			i--
			dAtA[i] = 0x22
		}
	}
	if m.PageOffset != 0 {
		i = encodeVarintList(dAtA, i, uint64(m.PageOffset))
		i--
		dAtA[i] = 0x18
	}
	if m.ItemLimit != 0 {
		i = encodeVarintList(dAtA, i, uint64(m.ItemLimit))
		i--
		dAtA[i] = 0x10
	}
	if len(m.Order) > 0 {
		i -= len(m.Order)
		copy(dAtA[i:], m.Order)
		i = encodeVarintList(dAtA, i, uint64(len(m.Order)))
		i--
		dAtA[i] = 0xa
	}
	return len(dAtA) - i, nil
}

func encodeVarintList(dAtA []byte, offset int, v uint64) int {
	offset -= sovList(v)
	base := offset
	for v >= 1<<7 {
		dAtA[offset] = uint8(v&0x7f | 0x80)
		v >>= 7
		offset++
	}
	dAtA[offset] = uint8(v)
	return base
}
func (m *List) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	l = len(m.Order)
	if l > 0 {
		n += 1 + l + sovList(uint64(l))
	}
	if m.ItemLimit != 0 {
		n += 1 + sovList(uint64(m.ItemLimit))
	}
	if m.PageOffset != 0 {
		n += 1 + sovList(uint64(m.PageOffset))
	}
	if len(m.FieldMask) > 0 {
		for _, s := range m.FieldMask {
			l = len(s)
			n += 1 + l + sovList(uint64(l))
		}
	}
	return n
}

func sovList(x uint64) (n int) {
	return (math_bits.Len64(x|1) + 6) / 7
}
func sozList(x uint64) (n int) {
	return sovList(uint64((x << 1) ^ uint64((int64(x) >> 63))))
}
func (this *List) String() string {
	if this == nil {
		return "nil"
	}
	s := strings.Join([]string{`&List{`,
		`Order:` + fmt.Sprintf("%v", this.Order) + `,`,
		`ItemLimit:` + fmt.Sprintf("%v", this.ItemLimit) + `,`,
		`PageOffset:` + fmt.Sprintf("%v", this.PageOffset) + `,`,
		`FieldMask:` + fmt.Sprintf("%v", this.FieldMask) + `,`,
		`}`,
	}, "")
	return s
}
func valueToStringList(v interface{}) string {
	rv := reflect.ValueOf(v)
	if rv.IsNil() {
		return "nil"
	}
	pv := reflect.Indirect(rv).Interface()
	return fmt.Sprintf("*%v", pv)
}
func (m *List) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowList
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
			return fmt.Errorf("proto: List: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: List: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		case 1:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field Order", wireType)
			}
			var stringLen uint64
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowList
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
				return ErrInvalidLengthList
			}
			postIndex := iNdEx + intStringLen
			if postIndex < 0 {
				return ErrInvalidLengthList
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			m.Order = string(dAtA[iNdEx:postIndex])
			iNdEx = postIndex
		case 2:
			if wireType != 0 {
				return fmt.Errorf("proto: wrong wireType = %d for field ItemLimit", wireType)
			}
			m.ItemLimit = 0
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowList
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				m.ItemLimit |= int64(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
		case 3:
			if wireType != 0 {
				return fmt.Errorf("proto: wrong wireType = %d for field PageOffset", wireType)
			}
			m.PageOffset = 0
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowList
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				m.PageOffset |= int64(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
		case 4:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field FieldMask", wireType)
			}
			var stringLen uint64
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowList
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
				return ErrInvalidLengthList
			}
			postIndex := iNdEx + intStringLen
			if postIndex < 0 {
				return ErrInvalidLengthList
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			m.FieldMask = append(m.FieldMask, string(dAtA[iNdEx:postIndex]))
			iNdEx = postIndex
		default:
			iNdEx = preIndex
			skippy, err := skipList(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if (skippy < 0) || (iNdEx+skippy) < 0 {
				return ErrInvalidLengthList
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
func skipList(dAtA []byte) (n int, err error) {
	l := len(dAtA)
	iNdEx := 0
	depth := 0
	for iNdEx < l {
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return 0, ErrIntOverflowList
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
					return 0, ErrIntOverflowList
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
					return 0, ErrIntOverflowList
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
				return 0, ErrInvalidLengthList
			}
			iNdEx += length
		case 3:
			depth++
		case 4:
			if depth == 0 {
				return 0, ErrUnexpectedEndOfGroupList
			}
			depth--
		case 5:
			iNdEx += 4
		default:
			return 0, fmt.Errorf("proto: illegal wireType %d", wireType)
		}
		if iNdEx < 0 {
			return 0, ErrInvalidLengthList
		}
		if depth == 0 {
			return iNdEx, nil
		}
	}
	return 0, io.ErrUnexpectedEOF
}

var (
	ErrInvalidLengthList        = fmt.Errorf("proto: negative length found during unmarshaling")
	ErrIntOverflowList          = fmt.Errorf("proto: integer overflow")
	ErrUnexpectedEndOfGroupList = fmt.Errorf("proto: unexpected end of group")
)