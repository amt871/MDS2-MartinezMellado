import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera__administrador_';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import './vista-resultado_busqueda_usuarios_item';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-resultado_busqueda_usuarios')
export class VistaResultado_busqueda_usuarios extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" theme="spacing">
 <vista-cabecera__administrador_ style="width: 100%; height: 5%;"></vista-cabecera__administrador_>
 <vaadin-horizontal-layout style="width: 100%; flex-shrink: 1; flex-grow: 0; height: 94%;">
  <vaadin-vertical-layout theme="spacing" style="width: 60%;">
   <label style="margin-left: var(--lumo-space-m); align-self: center;">Lista de usuarios</label>
   <vaadin-scroller style="width: 100%; height: 100%;">
    <vista-resultado_busqueda_usuarios_item style="height: 13%;"></vista-resultado_busqueda_usuarios_item>
    <vista-resultado_busqueda_usuarios_item style="height: 13%;"></vista-resultado_busqueda_usuarios_item>
    <vista-resultado_busqueda_usuarios_item style="height: 13%;"></vista-resultado_busqueda_usuarios_item>
    <vista-resultado_busqueda_usuarios_item style="height: 13%;"></vista-resultado_busqueda_usuarios_item>
    <vista-resultado_busqueda_usuarios_item style="height: 13%;"></vista-resultado_busqueda_usuarios_item>
    <vista-resultado_busqueda_usuarios_item style="height: 13%;"></vista-resultado_busqueda_usuarios_item>
    <vista-resultado_busqueda_usuarios_item style="height: 13%;"></vista-resultado_busqueda_usuarios_item>
    <vista-resultado_busqueda_usuarios_item style="height: 13%;"></vista-resultado_busqueda_usuarios_item>
    <vista-resultado_busqueda_usuarios_item style="height: 13%;"></vista-resultado_busqueda_usuarios_item>
   </vaadin-scroller>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 40%; height: 100%; align-self: center; align-items: center; justify-content: center;">
   <vaadin-text-field style="width: 60%;"></vaadin-text-field>
   <vaadin-button style="width: 60%;">
    Buscar Usuario
   </vaadin-button>
   <vaadin-button style="width: 60%;">
    Buscar Hashtag
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
