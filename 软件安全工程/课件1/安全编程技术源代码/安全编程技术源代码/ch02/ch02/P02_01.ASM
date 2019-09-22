	ifndef	??version
?debug	macro
	endm
	endif
	?debug	S "p02_01.c"
_TEXT	segment	byte public 'CODE'
DGROUP	group	_DATA,_BSS
	assume	cs:_TEXT,ds:DGROUP,ss:DGROUP
_TEXT	ends
_DATA	segment word public 'DATA'
d@	label	byte
d@w	label	word
_DATA	ends
_BSS	segment word public 'BSS'
b@	label	byte
b@w	label	word
	?debug	C E94E5C2D3B087030325F30312E63
_BSS	ends
_TEXT	segment	byte public 'CODE'
;	?debug	L 1
_function	proc	near
	push	bp
	mov	bp,sp
@1:
;	?debug	L 3
	pop	bp
	ret	
_function	endp
;	?debug	L 4
_main	proc	near
;	?debug	L 5
	mov	ax,2
	push	ax
	mov	ax,1
	push	ax
	call	near ptr _function
	pop	cx
	pop	cx
@2:
;	?debug	L 6
	ret	
_main	endp
_TEXT	ends
	?debug	C E9
_DATA	segment word public 'DATA'
s@	label	byte
_DATA	ends
_TEXT	segment	byte public 'CODE'
_TEXT	ends
	public	_function
	public	_main
	end
