import { Message } from "@angular/compiler/src/i18n/i18n_ast"

export interface Chat {
    content: string,
    message_type: Message;
}