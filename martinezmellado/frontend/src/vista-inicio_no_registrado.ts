import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import './vista-inicio_no_registrado_item';
import './vista-cabecera_usuario_no_registrado';

@customElement('vista-inicio_no_registrado')
export class VistaInicio_no_registrado extends LitElement {
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
 <vista-cabecera_usuario_no_registrado style="width: 100%; height: 5%;"></vista-cabecera_usuario_no_registrado>
 <vaadin-scroller style="width: 100%; height: 95%;">
  <vista-inicio_no_registrado_item></vista-inicio_no_registrado_item>
  <vista-inicio_no_registrado_item></vista-inicio_no_registrado_item>
  <vista-inicio_no_registrado_item></vista-inicio_no_registrado_item>
  <vista-inicio_no_registrado_item></vista-inicio_no_registrado_item>
 </vaadin-scroller>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
