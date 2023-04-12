import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-icons/vaadin-icons.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import './vista-comentario_item';

@customElement('vista-comentario')
export class VistaComentario extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-scroller style="width: 100%; height: 100%;">
  <vista-comentario_item style="width: 100%; height: 20%;"></vista-comentario_item>
  <vista-comentario_item style="width: 100%; height: 20%;"></vista-comentario_item>
  <vista-comentario_item style="width: 100%; height: 20%;"></vista-comentario_item>
  <vista-comentario_item style="width: 100%; height: 20%;"></vista-comentario_item>
  <vista-comentario_item style="width: 100%; height: 20%;"></vista-comentario_item>
  <vista-comentario_item style="width: 100%; height: 20%;"></vista-comentario_item>
 </vaadin-scroller>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
